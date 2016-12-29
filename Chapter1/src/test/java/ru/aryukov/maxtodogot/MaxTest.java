package ru.aryukov.maxtodogot;

import org.junit.Test;
import ru.aryukov.maxtodigit.Max;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by olega on 29.12.16.
 */
public class MaxTest {
    Max max = new Max();
    @Test
    public void twoDidgitsMax(){
        assertThat(max.max(1,-4), is(1));
    }
}
