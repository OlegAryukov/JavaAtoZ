package ru.aryukov.nestedIterato;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;
import java.util.Iterator;

/**
 * Created by olega on 23.01.17.
 */
public class NestedIteratorTest {
        /**
         * Test for nested iterators.
         */
        @Test
        public void whenWeCreateNestedIterators() {
            final Integer[] first = {4, 2, 0, 4, 6, 4, 9};
            final Integer[] second = {0, 9, 8, 7, 5};
            final Integer[] third = {1, 3, 5, 6, 7, 0, 9, 8, 4};
            ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(first));
            ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(second));
            ArrayList<Integer> thirdList = new ArrayList<>(Arrays.asList(third));
            Iterator<Integer> firstIt = firstList.iterator();
            Iterator<Integer> secondIt = secondList.iterator();
            Iterator<Integer> thirdIt = thirdList.iterator();

            ArrayList<Iterator<Integer>> nestedIteratorsList = new ArrayList<>();
            nestedIteratorsList.add(firstIt);
            nestedIteratorsList.add(secondIt);
            nestedIteratorsList.add(thirdIt);

            Iterator<Iterator<Integer>> iteratorOfIterators = nestedIteratorsList.iterator();

            NestedIterator nestedIterator = new NestedIterator();
            final int size = 21;
            final int[] checked = new int[]{4, 2, 0, 4, 6, 4, 9, 0, 9, 8, 7, 5, 1, 3, 5, 6, 7, 0, 9, 8, 4};
            final int[] result = new int[size];
            int i = 0;
            Iterator<Integer> it = nestedIterator.convert(iteratorOfIterators);
            while (it.hasNext()) {
                result[i++] = it.next();
            }
            assertThat(result, is(checked));
        }
}
