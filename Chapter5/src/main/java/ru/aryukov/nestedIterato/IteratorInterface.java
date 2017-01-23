package ru.aryukov.nestedIterato;

import java.util.Iterator;

/**
 * Created by oaryukov on 08.01.2017.
 * @param <T> common params
 */
public interface IteratorInterface<T> extends Iterator {
    /**
     * Method for implimentation.
     * @param iterator inner param
     * @return Iterator
     */
    Iterator<T> convert(Iterator<Iterator<T>> iterator);
}
