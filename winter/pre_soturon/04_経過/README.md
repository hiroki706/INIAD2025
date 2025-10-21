# 目標: T-kernelをQEMUで動かす

(rustで始める自作OS入門、先生が勧めていたので電子で購入、Arduio uno r4 wifiも注文した)

# 経過: 
- mtkernel v3のソースコードをclone、arm-none-eabi-gccで.elfファイルをビルド
```bash
sudo apt install arm-none-eabi-gcc
# in ~/mtkernel_3 
make -C build_make/ 
```
- vscodeのC言語コンフィグ編集で赤線を消した
  - .vscode/c_cpp_properties.jsonで
  ```
  "compilerArgs": [
    "-I/home/iniad/Documents/INIAD2025/winter/pre_soturon/mtkernel_3/include",
    "-I/home/iniad/Documents/INIAD2025/winter/pre_soturon/mtkernel_3/kernel/knlinc",
    "-I/home/iniad/Documents/INIAD2025/winter/pre_soturon/mtkernel_3/config"
  ],
  ```
  を設定
- Arduio uno r4 wifiが届いた。実機の動作確認も可能に。

## QEMUによる動作確認
- `qemu-system-arm` をインストール。
- `mtkernel_3/build_make` ディレクトリで以下のコマンドを実行。
   ```bash
   qemu-system-arm -M lm3s6965evb -nographic -kernel mtkernel_3.elf
   ```
- `Timer with period zero, disabling` という警告の後、ハングアップした。
  - `usermain` 関数がすぐにreturnするため、実行するタスクがなくなりアイドル状態になっていると推測。
    - `usermain.c` を修正して、メッセージ表示と無限ループを追加する。
    - セミホスティングを試すも
    ```qemu-system-arm -M lm3s6965evb -nographic -semihosting-config enable=on,target=native -kernel mtkernel_3.elf```
    - 相変わらずなにも表示されずハングアップ。
    - 自分のc言語ファイルは動作する
    ```bash
    arm-none-eabi-gcc -c -mcpu=cortex-m3 -mthumb -o startup.o startup.s
    arm-none-eabi-gcc -c -mcpu=cortex-m3 -mthumb -o hello_qemu.o hello_qemu.c  
    arm-none-eabi-gcc -mcpu=cortex-m3 -mthumb --specs=rdimon.specs -T linker.ld -o hello_qemu.elf startup.o hello_qemu.o -nostartfiles
    ```
