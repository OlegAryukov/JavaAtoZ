package ru.aryukov;

/**
 * Created by oaryukov on 05.01.2017.
 * @param <E>this is Object
 */
public interface Iterator<E> {
    /**
     * Method return next element.
     * @return E this is Object
     */
    E next();

    /**
     * Checking that collection have one more element.
     * @return boolean flag
     */
    boolean hasNext();
}
