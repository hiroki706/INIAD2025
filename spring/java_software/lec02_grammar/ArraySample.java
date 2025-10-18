public class ArraySample {
    public static void main(String[] args) {
        int[] array1 = { 1, -2, 3, 4, -5 };
        int result = positive(array1);
        System.out.println(result);

        String[] array2 = { "Information", "Networking", "for", "Innovation", "And", "Design" };
        printOdd(array2);
    }

    public static int positive(int[] array) {
        //
        int pos_sum = 0;
        for (int e : array) {
            if (e > 0) {
                pos_sum += e;
            }
        }
        return pos_sum;
    }

    public static void printOdd(String[] array) {
        //
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
