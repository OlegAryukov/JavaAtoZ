package ru.aryukov.list;


/**
 * Created by olega on 25.01.17.
 */
public class MyArrayList<T> {

    private Object[] conteiner;
    private Object[] defaultCont = new Object[10];
    private int size;

    public <T> MyArrayList(int initialCapacity) {
        conteiner = new Object[initialCapacity];
        size = 0;
    }
    public <T> MyArrayList(){
        conteiner = defaultCont;

    }


}
