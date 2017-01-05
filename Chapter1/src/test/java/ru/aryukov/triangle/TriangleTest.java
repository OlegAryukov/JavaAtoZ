package ru.aryukov.triangle;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by olega on 27.12.16.
 */
public class TriangleTest {
    Point a = new Point(2,2);
    Point b = new Point(2,-2);
    Point c = new Point(0,0);
    //Point d = new Point()
    @Test
    public void calculatingDistance(){
        assertThat(a.distanceTo(b),is(4.0));
    }
}
