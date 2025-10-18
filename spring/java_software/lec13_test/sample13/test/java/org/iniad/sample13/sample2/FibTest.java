package java_software.lec13_test.sample13.test.java.org.iniad.sample13.sample2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibTest {
    @Test(timeout = 100)
    public void testFib3() {
        Fib.fib(40);
    }
}
