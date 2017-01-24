package ru.aryukov.eveniterator;

import java.util.NoSuchElementException;

/**
 * Created by oaryukov on 05.01.2017.
 */
public class EvenIterator implements Iterator {

    private final int[] array;
    private int index = 0;
    private int result;

    /**
     * This is constructor.
     * @param array for input
     */
    public EvenIterator(int[] array) {
        this.array = array;
    }

    /**
     * This method return next element in collection, if it have.
     * @return Object of collection
     */
    @Override
    public Object next() {
        result = 0;

        if (array[index] % 2 == 0) {
            result = array[index];
            index++;
        } else {
            index++;
            this.next();
        }

        if (result == 0) {
            throw new NoSuchElementException();
        }
        return result;

    }

    /**
     * This method checking that in collection have one more element.
     * @return boolean flag have or not have
     */
    @Override
    public boolean hasNext() {
        int currentIndex = this.index;
        boolean flag = false;
        while (array.length > currentIndex) {
            if (array[currentIndex++] % 2 == 0) {
                flag = true;
                break;
            }
            currentIndex++;
        }
        return flag;
    }
}
