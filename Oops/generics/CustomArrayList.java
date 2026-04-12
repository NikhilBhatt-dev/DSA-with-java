// package generics;

// // import java.util.ArrayList;
// import java.util.Arrays;

// public class CustomArrayList{

//     private int[] data;

//     private  static int DEFAULT_SIZE = 10;
//     private int size = 0;
//     //also working as index value

//     public CustomArrayList() {
//         this.data = new int[DEFAULT_SIZE];
//     }

//     public void add(int num) {
//         if (isFull()) {
//             resize();
//         }
//         data[size++] = num;
        
//     }

//     private boolean isFull() {
//         return size == data.length;
//     }

//     private void resize() {
//         int[] temp = new int[data.length * 2];

//         //copy the current item in the new array

//         for (int i = 0; i < data.length; i++) {
//             temp[i] = data[i];
//         }
//         data = temp;
//     }

//     public int remove(){
//         int removed = data[--size];
//         return removed;
//     }

//     public int size(){
//         return size;
//     }

//     public int set(int index, int value) {
//         data[index] = value;
//         return data[index];
        

//     }

    

//     @Override
//     public String toString() {
//         return "CustomArrayList{"
//                 + "data=" + Arrays.toString(data)
//                 + ", size=" + size
//                 + '}';
//     }

//     public static void main(String[] args) {
//         // ArrayList list = new ArrayList();
//         CustomArrayList list = new CustomArrayList();
//       list.add(3);
//       list.add(4);
//       list.add(5);
//       System.out.println(list);
//     }
// }



package generics;

import java.util.Arrays;

public class CustomArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
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

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        T removed = (T) data[--size];
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
        return "CustomArrayList{"
                + "data=" + Arrays.toString(Arrays.copyOf(data, size))
                + ", size=" + size
                + '}';
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        CustomArrayList<String> strList = new CustomArrayList<>();
        strList.add("Hello");
        strList.add("World");

        System.out.println(strList);
    }
}
