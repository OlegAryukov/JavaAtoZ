package ru.aryukov.storconteiner;

import ru.aryukov.SimpleArray.SimpleArray;

/**
 * Created by olega on 24.01.17.
 */
public class RoleStore implements Store<Role> {
    /**
     * Data container.
     */
    private SimpleArray<Role> conteiner;

    /**
     * Constructor.
     * @param conteiner initial data container
     */
    public RoleStore(SimpleArray<Role> conteiner) {
        this.conteiner = conteiner;
    }

    @Override
    public void add(Role element) {
        conteiner.add(element);
    }

    @Override
    public void update(Role oldElement, Role newElement) {
        conteiner.update(oldElement, newElement);
    }

    @Override
    public void delete(Role element) {
        conteiner.delete(element);
    }

}
