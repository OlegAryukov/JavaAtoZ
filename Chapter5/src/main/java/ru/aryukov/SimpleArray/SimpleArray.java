package ru.aryukov.SimpleArray;

/**
 * Created by oaryukov on 23.01.2017.
 */
public class SimpleArray<E> {

    private Object[] conteiner;
    private int index = 0;

    public SimpleArray(int size) {
        this.conteiner = new Object[size];
    }

    public void add(E element){
        conteiner[index++] = element;
    }

    public E get(int position){
        return (E) conteiner[position];
    }

    public void delete(E object){
        int count = 0;
        for (Object e:conteiner) {
            if(object.equals(e)){
                conteiner[count] = null;
            }
            count++;
        }
    }

    public void update(E old, E newElem){
        int count = 0;
        for (Object e:conteiner) {
            if(old.equals(e)){
                conteiner[count] = newElem;
            }
            count++;
        }
    }

}
