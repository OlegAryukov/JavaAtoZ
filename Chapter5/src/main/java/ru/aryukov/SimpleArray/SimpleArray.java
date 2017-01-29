package ru.aryukov.SimpleArray;

/**
 * Created by oaryukov on 23.01.2017.
 * @param <E> generic
 */
public class SimpleArray<E> {

    /**
     * Data of elements.
     */
    private Object[] conteiner;
    /**
     * Count of elements.
     */
    private int index = 0;

    /**
     * Constructor.
     * @param size initial capacity
     */
    public SimpleArray(int size) {
        this.conteiner = new Object[size];
    }

    /**
     * Method for adding element.
     * @param element for adding
     */
    public void add(E element) {
        conteiner[index++] = element;
    }

    /**
     * Method for getting element by position.
     * @param position where element is
     * @return E element
     */
    public E get(int position) {
        return (E) conteiner[position];
    }

    /**
     * Metod for deleting element.
     * @param object element which we wont ot delete
     */
    public void delete(E object) {
        int count = 0;
        for (Object e:conteiner) {
            if (object.equals(e)) {
                conteiner[count] = null;
            }
            count++;
        }
    }

    /**
     * Method for updating element.
     * @param old element
     * @param newElem element
     */
    public void update(E old, E newElem) {
        int count = 0;
        for (Object e:conteiner) {
            if (old.equals(e)) {
                conteiner[count] = newElem;
            }
            count++;
        }
    }

}
