// 以下の要件を満たすクラス NameCard を宣言しなさい。
// String 型のインスタンス・フィールド firstName および familyName をもつ。これらは、コンストラクタ以外から代入できない。
// int 型のインスタンス・フィールド id をもつ。これらは、コンストラクタ以外から代入できない。
// コンストラクタ NameCard(String firstName, String familyName) をもつ
// 引数の値は、対応するインスタンス・フィールドに設定される。また、 id には1から連番が振られる。
// インスタンス・メソッド getLabel は、動作例に示すような文字列を返す。
package atnd;

public class NameCard {
    static int i = 0;

    final String firstName, familyName;
    final int id;

    NameCard(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.id = ++i;
    }

    public String getLabel() {
        return String.format("No. %d: %s %s", id, firstName, familyName);
    }
}
