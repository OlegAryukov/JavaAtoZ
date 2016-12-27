package ru.aryukov.triangle;

/**
 * Created by olega on 27.12.16.
 */
public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    /**
     * Constructor.
     * @param a
     * @param b
     * @param c
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method for calculating triangle area.
     * @param triangle
     * @return triangle area
     */
    public double area(Triangle triangle) {
        double ab = triangle.a.distanceTo(triangle.b);
        double ac = triangle.a.distanceTo(triangle.c);
        double bc = triangle.b.distanceTo(triangle.c);
        if((ab + ac)>(bc)) {
            double p = (ac + bc + ab) / 2;
            return Math.sqrt(p * (p - ac) * (p - ab) * (p - bc));
        }
        return -1;
    }
}
