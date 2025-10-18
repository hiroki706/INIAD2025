package java_software.lec13_test.sample13.main.java.org.iniad.sample13.sample2;

import java.util.Map;
import java.util.TreeMap;

public class Fib {
    private static Map<Integer, Integer> memo = new TreeMap<>();
    public static int fib(int n) {
        if(n < 0) {
            throw new UnsupportedOperationException();
        }
        if (memo.containsKey(n)) return memo.get(n);
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }
}
