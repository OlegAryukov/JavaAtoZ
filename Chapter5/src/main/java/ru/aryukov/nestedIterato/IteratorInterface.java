package ru.aryukov.nestedIterato;

import ru.aryukov.Iterator;

/**
 * Created by oaryukov on 08.01.2017.
 */
public interface IteratorInterface {
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> iterator);
}
