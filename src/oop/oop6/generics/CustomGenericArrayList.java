package oop.oop6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // working as a length

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }


    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the data to new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        data[size] = null;
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    static void main(String[] args) {

//        CustomGenericArrayList<Integer> list = new CustomGenericArrayList();
        CustomGenericArrayList<String> list = new CustomGenericArrayList();
        list.add("adp");
        list.add("dev");
        list.add("adi");

//        for (int i = 0; i < 7; i++) {
//            list.add((int)(Math.random() * 100));
//        }

        System.out.println(list.toString());
        list.remove();
        System.out.println(list.toString());




    }
}
