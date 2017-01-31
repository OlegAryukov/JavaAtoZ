package ru.aryukov.linkedList;

/**
 * Created by oaryukov on 30.01.2017.
 */
public class MyLinkedList<T> {
    private Entry<T> first;
    private Entry<T> last;

    private int size;

    public MyLinkedList() {
        //Entry<T> newEntry = new Entry<T>(null, last, first);
        this.first = new Entry<T>(null, last, first);
        this.size = 0;
    }

    public void add(T element) {
        if (size == 0) {
            Entry<T> newEntry = new Entry<T>(element, last, first);
            this.last = newEntry;
            size++;
        } else {
            linkedAtLast(element);
        }

    }

    public Entry<T> getHeader(){
        return first;
    }

    private void linkedAtLast(T element){
        Entry<T> newEntry = new Entry<T>(element, last, last.previos);
        this.last = newEntry;
        size++;
    }

    public int getSize(){
        return size;
    }
    private static class Entry<E>{
        E element;
        Entry<E> next;
        Entry<E> previos;

        Entry(E element, Entry<E> next, Entry<E> previos){
            this.element = element;
            this.next = next;
            this.previos = previos;
        }
    }
}

