package ss10_arrayllist_and_linhkedlist.bai_tap;

import java.util.Arrays;

public class MyLists<E> {
    private int size = 0;
    public final int DEFAULT_SIZE = 5;
    private  Object element[];

    public MyLists() {
        size = element.length;
        element = new Object[DEFAULT_SIZE];
    }
    public MyLists(int capacity){
        element = new Object[capacity];
    }

    public void resize(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(int index,E newElement){
        if(index >= 0 && index < element.length){
            for (int i = element.length - 1; i > index; i--){
                element[i] = element[i - 1];
            }
            element[index] = newElement;
        }else if (size == element.length){
            resize();
        }
       element[size++] = newElement;
    }

    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }

    public void remove(int i){
        while (i < element.length - 1){
            element[i] = element[i + 1];
            i++;
        }
        element[element.length - 1] = null;
    }

    public int size() {
        return size;
    }
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (element[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(element[i]))
                    return i;
        }
        return -1;
    }
    public void clear(){
        for (int i = 0; i < element.length; i++){
            element[i] = null;
        }
        size = 0;
    }
}
