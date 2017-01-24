package ru.aryukov.simplearraytest;

import org.junit.Test;
import ru.aryukov.SimpleArray.SimpleArray;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by olega on 24.01.17.
 */
public class SimpleArrayTest {
    /**
     * Test for nested iterators.
     */
    @Test
    public void whenWeAddInSimpleArray() {
        SimpleArray<String> conteiner = new SimpleArray<>(5);
        conteiner.add("Hello");
        assertThat("Hello", is(conteiner.get(0)));
    }

    @Test
    public void whenWeGetByIndexSimpleArray() {
        SimpleArray<String> conteiner = new SimpleArray<>(5);
        conteiner.add("Hello");
        conteiner.add("Hi");
        conteiner.add("world");
        assertThat("world", is(conteiner.get(2)));
    }

    @Test
    public void whenWeDeleteObjectSimpleArray() {
        SimpleArray<String> conteiner = new SimpleArray<>(5);
        conteiner.add("Hello");
        conteiner.add("Hi");
        conteiner.add("world");
        conteiner.delete("Hi");
        assertThat(null, is(conteiner.get(1)));
    }
}
