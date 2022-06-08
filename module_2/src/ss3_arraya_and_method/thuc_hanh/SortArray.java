package ss3_arraya_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("add new array 5 element!");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        for (int index: array){
            System.out.print(index + " ");
        }
        System.out.println("\n");
        int first = 0, last = array.length - 1, tmp;
        while (first < last){
            tmp = array[first];
            array[first] = array[last];
            array[last] = tmp;
            first++;
            last--;
        }
        System.out.println("sort array = " + Arrays.toString(array));
    }
}
