package oop.oop6.generics;

import java.util.Arrays;
import java.util.List;

// here T can be either Number or its subclasses only
public class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // working as a length

    public void getList(List<? extends Number> list) {
        // do something
    }

    public WildCardExample() {
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

        WildCardExample<Integer> list1 = new WildCardExample();
        list1.add(343);

        WildCardExample<Float> list2 = new WildCardExample();
        list2.add(45.34f);

        WildCardExample<Double> list3 = new WildCardExample();
        list3.add(45.343);

        System.out.println(list1.toString());
        list1.remove();
        System.out.println(list1.toString());




    }
}
