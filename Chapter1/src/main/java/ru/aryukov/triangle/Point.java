package ru.aryukov.triangle;

/**
 * Created by olega on 27.12.16.
 */
public class Point {
    /**
     * Data.
     */
    private double x;
    /**
     * Data.
     */
    private double y;

    /**
     * Constructor.
     * @param x - x coordiante
     * @param y - y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method that calculated distance between teo points.
     * @param point - disctance to this point
     * @return distance
     */
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
    }
}
