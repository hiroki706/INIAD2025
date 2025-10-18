package java_software.lec13_test.sample13.test.java.org.iniad.sample13.assignment1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class BookTest {
    @Test
    public void testConstructor() {
        Book book = new Book(
                "somebock",
                100
        );
        assertThat(book.getTaxPrice(), is(110));
        assertThat(book.getName(), is("somebock"));
    }
}
