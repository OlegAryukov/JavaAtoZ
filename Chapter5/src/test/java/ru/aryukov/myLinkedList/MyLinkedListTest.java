package ru.aryukov.myLinkedList;

import org.junit.Test;
import ru.aryukov.linkedList.MyLinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by olega on 31.01.17.
 */
public class MyLinkedListTest {
    @Test
    public void whenWeAdd(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("Hello");
        myLinkedList.add("world");
        myLinkedList.add("this");
        myLinkedList.add("is");
        assertThat(myLinkedList.getSize(), is(4));
    }

    @Test
    public void whenWeAddByPosition(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("Hello");
        myLinkedList.add("world");
        myLinkedList.add("this");
        myLinkedList.add("is");
        myLinkedList.add("Make", 3);
        assertThat(myLinkedList.getSize(), is(5));
    }

}
