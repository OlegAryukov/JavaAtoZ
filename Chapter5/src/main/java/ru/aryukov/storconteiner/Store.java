package ru.aryukov.storconteiner;

import ru.aryukov.SimpleArray.SimpleArray;

/**
 * Created by olega on 24.01.17.
 */
public interface Store<T extends Base> {

    void add(T element);

    void update(T oldElement, T newElement);

    void delete(T element);
}
