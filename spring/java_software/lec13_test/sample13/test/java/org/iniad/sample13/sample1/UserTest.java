package java_software.lec13_test.sample13.test.java.org.iniad.sample13.sample1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import java.time.LocalDate;

public class UserTest {
    @Test
    public void testConstructor() {
        User user = new User(
                "enro", "Noway",
                LocalDate.of(2000, 3, 18)
        );
        assertThat(user.getFirstName(), is("enro"));
        assertThat(user.getFamilyName(), is("Noway"));
    }
}
