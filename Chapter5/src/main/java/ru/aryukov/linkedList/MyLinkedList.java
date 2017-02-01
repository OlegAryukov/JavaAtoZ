package ru.aryukov.linkedList;

/**
 * Created by oaryukov on 30.01.2017.
 */
public class MyLinkedList<T> {
    private Entry<T> first;
    private Entry<T> last;

    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    public void add(T element) {
        if (size == 0) {
            Entry<T> tmp = last;
            Entry<T> newEntry = new Entry<T>(element, null, tmp);
            last = newEntry;
            first = newEntry;
            size++;
        } else {
            linkedAtLast(element);
        }

    }

    public Entry<T> getHeader(){
        return first;
    }

    private void linkedAtLast(T element){
        Entry<T> tmp = last;
        Entry<T> newEntry = new Entry<T>(element, null, tmp);
        last = newEntry;
        tmp.next = newEntry;
        size++;
    }

    public void add(T element, int position){
        if(position < size){
            int i = 0;
            Entry<T> e = first;
            do {
                e = e.next;
                i++;
            }while (position - 1> i);
            Entry<T> tmp = e;
            Entry<T> newEntry = new Entry<T>(element, tmp, tmp.previos);
            tmp.previos.next = newEntry;
            tmp.previos = newEntry;
            size++;
        }
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

