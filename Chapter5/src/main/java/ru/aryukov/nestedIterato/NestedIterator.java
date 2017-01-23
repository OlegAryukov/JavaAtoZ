package ru.aryukov.nestedIterato;

import ru.aryukov.Iterator;

/**
 * Created by oaryukov on 08.01.2017.
 */
public class NestedIterator implements IteratorInterface {
    Iterator<Integer> outerIt;
    Iterator<Iterator<Integer>> innerIt;

    @Override
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> iterator) {
        this.innerIt = iterator;
        return outerIt;
    }
}
