package ru.aryukov;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {
    /**
     * Test add
     */
    @Test
    public void whenAdd() {
        Calculate.add(2.5, 3.5);
        assertThat(Calculate.getResult(),is(6.0));
    }
    /**
     * Test subtract
     */
    @Test
    public void whenSub() {
        Calculate.substract(2.6,2.1);
        assertThat(Calculate.getResult(), is(0.5));
    }
    /**
     * Test div
     */
    @Test
    public void whenDiv() {
        Calculate.div(9.0,3.0);
        assertThat(Calculate.getResult(), is(3.0));
    }
    /**
     * Test multiply
     */
    @Test
    public void whenMultiply() {
        Calculate.multiplay(3.0,3.0);
        assertThat(Calculate.getResult(), is(9.0));
    }
}
