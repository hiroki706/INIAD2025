
public class FindMaximum {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 4, 9};

        int max = numbers[0];
        for (int num: numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }}
