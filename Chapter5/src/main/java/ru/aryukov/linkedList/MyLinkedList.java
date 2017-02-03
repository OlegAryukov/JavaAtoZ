package ru.aryukov.linkedList;


/**
 * Created by oaryukov on 30.01.2017.
 * @param <T> generic
 */
public class MyLinkedList<T> {
    /**
     * First element of list.
     */
    private Entry<T> first;
    /**
     * Last element of list.
     */
    private Entry<T> last;

    /**
     * Size of list.
     */
    private int size;

    /**
     * Constructor.
     */
    public MyLinkedList() {
        this.size = 0;
    }

    /**
     * Method for adding element in list.
     * @param element witch add.
     */
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

    /**
     * Method for adding element in list, by posotion.
     * @param element witch add.
     * @param position where add.
     */
    public void add(T element, int position) {
        if (position < size) {
            int i = 0;
            Entry<T> e = first;
            do {
                e = e.next;
                i++;
            } while (position - 1 > i);
            Entry<T> tmp = e;
            Entry<T> newEntry = new Entry<T>(element, tmp, tmp.previos);
            tmp.previos.next = newEntry;
            tmp.previos = newEntry;
            size++;
        }
    }

    /**
     * Method for remove element.
     * @param element witch delete
     */
    public void remove(T element) {
        Entry<T> el = first;
        for (int i = 0; i < size + 1; i++) {
            if (el.element.equals(element)) {
                if (el.next == null) {
                    el.previos.next = null;
                    last = el.previos;
                    size--;
                    break;
                } else {
                    el.previos.next = el.next;
                    el.next.previos = el.previos;
                    size--;
                    break;
                }
            }
            el = el.next;
        }
    }

    /**
     * Method for get element by position.
     * @param index where element in list
     * @return <T> element
     */
    public T getElement(int index) {
        T element = null;
        if (index < size) {
            int i = 0;
            Entry<T> e = first;
            do {
                e = e.next;
                i++;
            } while (index - 1 > i);
            element = e.element;
        }
        return element;
    }

    /**
     * Method for getting first entry in list.
     * @return entry
     */
    public Entry<T> getHeader() {
        return first;
    }

    /**
     * Method for adding element in end of the list.
     * @param element witch adding
     */
    private void linkedAtLast(T element) {
        Entry<T> tmp = last;
        Entry<T> newEntry = new Entry<T>(element, null, tmp);
        last = newEntry;
        tmp.next = newEntry;
        size++;
    }

    /**
     * Method for transform list in array.
     * @param a array for transform
     * @param <T> generic type
     * @return array of element.
     */
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        }
        int i = 0;
        T[] result = a;
        for (Entry<T> x = (Entry<T>) first; x != null; x = x.next) {
            result[i++] = x.element;
        }

        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    /**
     * Method for getting size.
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Inner class Entry.
     * @param <E>
     */
    private static class Entry<E> {
        E element;
        Entry<E> next;
        Entry<E> previos;

        /**
         * Constructor.
         * @param element
         * @param next
         * @param previos
         */
        Entry(E element, Entry<E> next, Entry<E> previos) {
            this.element = element;
            this.next = next;
            this.previos = previos;
        }
    }

}

