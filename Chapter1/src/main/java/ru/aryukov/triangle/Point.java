package ru.aryukov.triangle;

/**
 * Created by olega on 27.12.16.
 */
public class Point {
    public double x;
    public double y;

    /**
     * Constructor.
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method that calculated distance between teo points.
     * @param point
     * @return distance
     */
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((point.x - this.x),2) + Math.pow((point.y - this.y),2));
    }
}
