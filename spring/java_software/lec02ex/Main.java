public class Main {
  public static void main(String[] args) {
    String result1 = checkEvenOdd(6);
    System.out.println("Result1: " + result1); // 偶数の場合

    String result2 = checkEvenOdd(9);
    System.out.println("Result2: " + result2); // 奇数の場合
  }

  // Fill in here
  public static String checkEvenOdd(int number) {
    switch (number % 2) {
      case 0:
        return "Even";
      case 1:
        return "Odd";
      default:
        return "Unknown"; // これは実行されないはず
    }
  }
}
