package ru.aryukov.storconteiner;

/**
 * Created by olega on 24.01.17.
 */
public abstract class Base {
    /**
     * uni id.
     */
    private String id;

    /**
     * Consturctor.
     * @param id for element
     */
    public Base(String id) {
        this.id = id;
    }

    /**
     * Getter for Id.
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id.
     * @param id new id
     */
    public void setId(String id) {
        this.id = id;
    }
}
