package ru.aryukov.nestedIterato;

import java.util.Iterator;

import java.util.function.Consumer;

/**
 * Created by oaryukov on 08.01.2017.
 * @param <T> common params
 */
public class NestedIterator<T> implements IteratorInterface<T> {
    /**
     * Nested iterators.
     */
    private Iterator<T> inIt;
    /**
     * Iterator for nested iterators.
     */
    private  Iterator<Iterator<T>> outIt;

    /**
     * Method that make thi class Iterator.
     * @param iterator this is nested iterators
     * @return Iterator of nested iterators
     */
    @Override
    public Iterator<T> convert(Iterator<Iterator<T>> iterator) {
        this.outIt = iterator;
        this.inIt = outIt.next();
        return this;
    }

    /**
     * Method that return next element.
     * @return T - element
     */
    @Override
    public T next() {
        T o = null;
        if (hasNext()) {
           o = inIt.next();
        }
        return o;
    }

    /**
     * Method checked that in collection have next element.
     * @return
     */
    @Override
    public boolean hasNext() {
        boolean flag = false;
        if (inIt.hasNext()) {
            flag = true;
        } else {
            if (outIt.hasNext()) {
                inIt = outIt.next();
                if (inIt.hasNext()) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    /**
     * Just stub.
     */
    @Override
    public void remove() {

    }

    /**
     *Just stub.
     * @param action
     */
    @Override
    public void forEachRemaining(Consumer action) {

    }
}
