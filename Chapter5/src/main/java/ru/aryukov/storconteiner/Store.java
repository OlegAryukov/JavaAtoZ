package ru.aryukov.storconteiner;


/**
 * Created by olega on 24.01.17.
 * @param <T> is generic.
 */
public interface Store<T extends Base> {

    /**
     * Method for adding element.
     * @param element element
     */
    void add(T element);

    /**
     * Method for apdating element.
     * @param oldElement old element
     * @param newElement new element
     */
    void update(T oldElement, T newElement);

    /**
     * Method for deleting element.
     * @param element witch should be delete
     */
    void delete(T element);
}
