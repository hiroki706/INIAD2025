# この学校用ディレクトリはgitで管理されGitHubにアップロードすることでバックアップされます

レポジトリがネストしているのでサブモジュールに管理します
```bash
git clone --recurse-submodules <>
# 既存クローン
git submodules update --init --recursive
```

git-lfsで重いファイルを管理
```bash
git lfs install
# もしエラーが出たら
sudo apt install git-lfs
```
