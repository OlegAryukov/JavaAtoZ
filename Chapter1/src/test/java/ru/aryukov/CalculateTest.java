package ru.aryukov;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {
    Calculate calculate = new Calculate();
    /**
     * Test add
     */
    @Test
    public void whenAdd() {
        calculate.add(2.5, 3.5);
        assertThat(calculate.getResult(),is(6.0));
    }
    /**
     * Test substract
     */
    @Test
    public void whenSub() {
        calculate.substract(2.6,2.1);
        assertThat(calculate.getResult(), is(0.5));
    }
    /**
     * Test div
     */
    @Test
    public void whenDiv() {
        calculate.div(9.0,3.0);
        assertThat(calculate.getResult(), is(3.0));
    }
    /**
     * Test multiplay
     */
    @Test
    public void whenMultiply() {
        calculate.multiplay(3.0,3.0);
        assertThat(calculate.getResult(), is(9.0));
    }
}
