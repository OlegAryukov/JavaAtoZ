package ru.aryukov.storconteiner;

import ru.aryukov.SimpleArray.SimpleArray;

/**
 * Created by olega on 24.01.17.
 */
public class UserStore implements Store<User> {

    private SimpleArray<User> conteiner = new SimpleArray<>(10);

    @Override
    public void add(User element) {
        conteiner.add(element);
    }

    @Override
    public void update(User oldElement, User newElement) {
        conteiner.update(oldElement, newElement);
    }

    @Override
    public void delete(User element) {
        conteiner.delete(element);
    }
}
