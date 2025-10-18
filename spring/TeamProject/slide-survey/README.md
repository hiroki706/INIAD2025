pptxにするには

```bash
npm ci
npx marp -I ./src --pptx-editable
```
src/slide.md
ページ更新をh1に
```md
<!--
headingDivider: 1
-->
```
画像の挿入
```md
![bg 50%](./img/hoge.png)
```
スタイル
```md
<!--
_backgroundColor: #005BAC
_color: white
-->
```
