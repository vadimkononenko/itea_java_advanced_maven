package com.itea.homeworks.task5.collections.arraylist;

import java.util.Arrays;

public class MyArrayListG<T> implements ArrayListG<T> {
    private Object[] array;
    private int size;

    public MyArrayListG() {
        array = new Object[10];
        size = 0;
    }

    @Override
    public void add(T item) {
        if (size == array.length - 1) {
            Object[] newArr = new Object[array.length * 2];
            System.arraycopy(array, 0, newArr, 0, size);
            array = newArr;
        }
        array[size++] = item;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
    }

    @Override
    public Object size() {
        return getSize();
    }

    @Override
    public void clear() {
        array = new Object[10];
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    private Object[] getArray() {
        return array;
    }

    private int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayListGeneric{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
