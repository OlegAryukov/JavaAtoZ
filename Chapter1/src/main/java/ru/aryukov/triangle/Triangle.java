package ru.aryukov.triangle;

/**
 * Created by olega on 27.12.16.
 */
public class Triangle {
    /**
     * Data.
     */
    private Point a;
    /**
     * Data.
     */
    private Point b;
    /**
     * Data.
     */
    private Point c;

    /**
     * Constructor.
     * @param a point A
     * @param b point B
     * @param c point C
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method for calculating triangle area.
     * @param triangle for calculation
     * @return triangle area
     */
    public double area(Triangle triangle) {
        double ab = triangle.a.distanceTo(triangle.b);
        double ac = triangle.a.distanceTo(triangle.c);
        double bc = triangle.b.distanceTo(triangle.c);
        if (((ab + ac) > bc) & (bc > 0)) {
            double p = (ac + bc + ab) / 2;
            return Math.sqrt(p * (p - ac) * (p - ab) * (p - bc));
        }
        return -1;
    }
}
