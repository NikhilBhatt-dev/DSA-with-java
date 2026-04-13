package generics;

import java.util.Arrays;

public class Generics<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public Generics() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    public T remove() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        T removed = (T) data[--size];
        data[size] = null; // good practice
        return removed;
    }

    public int size() {
        return size;
    }

    public T set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
        return value;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    @Override
    public String toString() {
        return "Generics{"
                + "data=" + Arrays.toString(Arrays.copyOf(data, size))
                + ", size=" + size
                + '}';
    }

    public static void main(String[] args) {
        Generics<Integer> list = new Generics<>();

        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        Generics<String> strList = new Generics<>();
        strList.add("Hello");
        strList.add("World");

        System.out.println(strList);
    }
}
