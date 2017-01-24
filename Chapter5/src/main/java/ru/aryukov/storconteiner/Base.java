package ru.aryukov.storconteiner;

/**
 * Created by olega on 24.01.17.
 */
public abstract class Base {
    private String id;

    public Base(String id) {
        this.id = id;
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
}
