package java_software.lec13_test.sample13.test.java.org.iniad.sample13.assignment1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class DeliciousFoodTest {
    @Test
    public void test() {
        DeliciousFood df = new DeliciousFood(
                "del",
                100
        );
        assertThat(df.getTaxPrice(), is(108));
        assertThat(df.getTaste(), is("Delicious"));
    }
}
