package java_software.lec13_test.sample13.test.java.org.iniad.sample13.assignment2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class OperatorTest {
    @Test
    public void test1() {
        Operator op = new Operator(
            "+"
        );

        Number n = new Number(1);
        op.add(new Number(1));
        op.add(n);

        assertThat(op.getChild(1), is(n));
        assertThat(op.eval(), is(2.0F));
    }
    @Test
    public void test12() {
        Operator op = new Operator(
                "-"
        );

        Number n = new Number(1);
        op.add(new Number(1));
        op.add(n);

        assertThat(op.getChild(1), is(n));
        assertThat(op.eval(), is(0.0F));
    }
    @Test
    public void test23() {
        Operator op = new Operator(
                "*"
        );

        Number n = new Number(1);
        op.add(new Number(1));
        op.add(n);

        assertThat(op.getChild(1), is(n));
        assertThat(op.eval(), is(1.0F));
    }
    @Test
    public void test43() {
        Operator op = new Operator(
                "/"
        );

        Number n = new Number(1);
        op.add(new Number(1));
        op.add(n);

        assertThat(op.getChild(1), is(n));
        assertThat(op.eval(), is(1.0F));
    }
    @Test(expected = UnsupportedOperationException.class)
    public void test01() {
        Operator op = new Operator(
                "FR"
        );

        Number n = new Number(1);
        op.add(new Number(1));
        op.add(n);

        op.getChild(1);
        op.eval();
    }
    @Test(expected = UnsupportedOperationException.class)
    public void test2() {
        Operator op = new Operator(
                "+"
        );

        Number n = new Number(1);
        op.add(n);
        op.eval();
    }
}
