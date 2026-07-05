package oop.oop6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // working as a length

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }


    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the data to new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        data[size] = 0;
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    static void main(String[] args) {
//        ArrayList list = new ArrayList<>();

//        list.add(45);
//        list.add(45);
//        list.add(45);
//        list.add(4);
//        list.remove(0);
//        list.get(0);
//        list.set(0, 12);
//        list.size();
//        list.isEmpty();


        CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 15; i++) {
            list.add((int)(Math.random() * 100));
        }

        System.out.println(list.toString());

        // this <String> is called generics
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Adp");



    }
}
