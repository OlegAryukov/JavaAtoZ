package ru.aryukov.linkedList;

/**
 * Created by oaryukov on 30.01.2017.
 */
public class MyLinkedList<T> {
    private static class Entry<E>{
        E element;
        Entry<E> next;
        Entry<E> previos;
    }
}

