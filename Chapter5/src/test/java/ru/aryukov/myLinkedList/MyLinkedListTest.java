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
    public void whenWeGet(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("Hello");
        myLinkedList.add("world");
        myLinkedList.add("this");
        myLinkedList.add("is");
        String result = myLinkedList.getElement(2);
        assertThat(result, is("world"));
    }

    @Test
    public void whenWeAddByPosition(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("Hello");
        myLinkedList.add("world");
        myLinkedList.add("this");
        myLinkedList.add("is");
        myLinkedList.add("Make", 3);
        String result = myLinkedList.getElement(3);
        assertThat(result, is("Make"));
    }

    @Test
    public void whenWeRemove(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("Hello");
        myLinkedList.add("world");
        myLinkedList.add("this");
        myLinkedList.add("is");
        myLinkedList.add("Make", 3);
        myLinkedList.remove("this");
        assertThat(myLinkedList.getSize(), is(4));
    }

    @Test
    public void whenWeGetArray(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("Hello");
        myLinkedList.add("world");
        myLinkedList.add("this");
        myLinkedList.add("is");
        String[] result = new String[]{"Hello", "world", "this", "is"};
        String[] test = myLinkedList.toArray(new String[myLinkedList.getSize()]);
        assertThat(result, is(test));
    }

}
