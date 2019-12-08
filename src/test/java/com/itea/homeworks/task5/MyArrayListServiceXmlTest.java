package com.itea.homeworks.task5;

import com.itea.homeworks.task5.collections.arraylist.MyArrayListG;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MyArrayListServiceXmlTest {

    @Test
    public void elementsShouldBeAddedInListCorrectly() {
        //PREDICATES
        MyArrayListG<String> actual = new MyArrayListG<>();

        //FUNCTIONALITY
        actual.add("a");
        actual.add("b");
        actual.add("c");
        actual.add("d");

        //TESTS
        assertEquals("a", actual.get(0));
        assertEquals("b", actual.get(1));
        assertEquals("c", actual.get(2));
        assertEquals("d", actual.get(3));
    }

    @Test
    public void elementsShouldBeRemovedCorrectly() {
        //PREDICATES
        MyArrayListG<String> actual = new MyArrayListG<>();
        actual.add("hello");
        actual.add("how");
        actual.add("are");
        actual.add("you");

        //FUNCTIONALITY
        actual.remove(0);

        //TESTS
        assertEquals("how", actual.get(0));
        assertEquals("are", actual.get(1));
        assertEquals("you", actual.get(2));
    }

    @Test
    public void listShouldReturnSizeCorrectly() {
        //PREDICATES
        MyArrayListG<String> actual = new MyArrayListG<>();
        actual.add("hello");
        actual.add("how");
        actual.add("are");
        actual.add("you");

        //TESTS
        assertEquals(4, actual.size());
    }

    @Test
    public void listShouldBeEmpty() {
        //PREDICATES
        MyArrayListG<String> actual = new MyArrayListG<>();
        actual.add("hello");
        actual.add("how");
        actual.add("are");
        actual.add("you");

        //FUNCTIONALITY
        actual.clear();

        //TESTS
        assertNull(actual.get(0));
        assertNull(actual.get(1));
        assertNull(actual.get(2));
        assertNull(actual.get(3));
    }
}
