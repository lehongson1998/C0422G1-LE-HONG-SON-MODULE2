package ss10_arrayllist_and_linhkedlist.thuc_hanh;

import java.util.Arrays;

public class MyList<A> {
    private int size = 0;
    public final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(A newElement){
        if (size == element.length){
            ensureCapa();
        }
        element[size++] = newElement;
    }

    public A get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (A) element[i];
    }
}
