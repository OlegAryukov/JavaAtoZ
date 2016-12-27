package ru.aryukov;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {
    /**
     * Test add
     */
    @Test
    public void whenAddOneToOneThwmTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(),is(String.format("Hello world!\n",System.getProperty("line.separator"))));
    }
}
