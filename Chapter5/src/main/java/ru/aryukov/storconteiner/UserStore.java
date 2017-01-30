package ru.aryukov.storconteiner;

import ru.aryukov.SimpleArray.SimpleArray;

/**
 * Created by olega on 24.01.17.
 */
public class UserStore implements Store<User> {

    /**
     * Data container.
     */
    private SimpleArray<User> conteiner;

    /**
     * Constructor.
     * @param conteiner initial data container
     */
    public UserStore(SimpleArray<User> conteiner) {
        this.conteiner = conteiner;
    }

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
