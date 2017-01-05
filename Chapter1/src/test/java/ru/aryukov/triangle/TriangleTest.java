package ru.aryukov.triangle;

import org.junit.Test;

/**
 * Created by olega on 27.12.16.
 */
public class TriangleTest {
    Point a = new Point(2,2);
    Point b = new Point(2, -2);
    Point c = new Point(0,0);
    Triangle triangle = new Triangle(a,b,c);
    @Test
    public void calculatingDistance(){
        assertThat(a.distanceTo(b), is(4.0));
    }
    @Test
    public void whenAreaCanBeCalculating(){
        assertThat(triangle.area(triangle), closeTo(4.0, 0.01));
    }

}
