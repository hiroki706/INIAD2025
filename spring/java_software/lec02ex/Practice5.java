public class Practice5 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 3, 7, 9, 1 };
        int[] unique = removeDuplicates(nums);
        for (int i : unique)System.out.println(i);
    }

    public static int[] removeDuplicates(int[] lst) {
        int[] result = new int[lst.length];
        result[0] = lst[0];
        int[] sortednums = qsort(lst);
        int mem = 0;
        for (int i = 1; i < lst.length; i++) {
            if (sortednums[i - 1] == sortednums[i]) {
                mem++;
                continue;
            }
            result[i - mem] = sortednums[i];
        }
        return result;

    }

    public static int[] qsort(int[] lst) {
        int pivot = lst[0];
        if (lst.length <= 1) {
            return lst;
        }
        int leftcount = 0, rightcount = 0;
        for (int e : lst) {
            if (e <= pivot) {
                leftcount++;
            } else {
                rightcount++;
            }
        }
        if (leftcount==lst.length){
            return lst;
        }
        int[] left = new int[leftcount];
        int[] right = new int[rightcount];
        int mem1 = 0;
        int mem2 = 0;
        for (int e : lst) {
            if (e <= pivot) {
                left[mem1] = e;
                mem1++;
            } else {
                right[mem2] = e;
                mem2++;
            }
        }
        return concat(qsort(left), qsort(right));
    }

    public static int[] concat(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            ans[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            ans[i + left.length] = right[i];
        }
        return ans;
    }
}
