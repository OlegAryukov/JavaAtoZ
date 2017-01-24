package ru.aryukov.eveniterator;


import org.junit.Test;
import ru.aryukov.eveniterator.EvenIterator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by oaryukov on 05.01.2017.
 */
public class EvenIteratorTest {
    @Test
    public void whenCallNext(){
        EvenIterator it = new EvenIterator(new int[]{2,5,6,8,9,7,3,10});

        it.next();
        it.next();
        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(10));
    }

    @Test
    public void whenHasNextCall(){
        EvenIterator it = new EvenIterator(new int[]{1,5,9});

        boolean result = it.hasNext();

        assertThat(result, is(false));
    }
}