public class Practice6 {
    public static void main(String[] args) {
        String password = "INIAD";
        // 修正箇所
        // 文字列の比較にequalsメソッドを使用する
        // == 演算子は参照の比較を行うため、equalsメソッドを使用して文字列の内容を比較する必要がある。
        // -- (args[0] == password)
        // ++ (args[0].equals(password))
        if (args[0].equals(password)) {
            System.out.println("The password is correct");
        } else{
            System.out.println("The password is incorrect");
        }
    }
}
