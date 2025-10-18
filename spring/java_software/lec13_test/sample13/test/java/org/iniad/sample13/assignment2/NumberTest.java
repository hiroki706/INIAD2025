package java_software.lec13_test.sample13.test.java.org.iniad.sample13.assignment2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class NumberTest {
    @Test
    public void testN() {
        Number n = new Number(4);

        assertThat(n.eval(), is(4.0F));
    }
}
