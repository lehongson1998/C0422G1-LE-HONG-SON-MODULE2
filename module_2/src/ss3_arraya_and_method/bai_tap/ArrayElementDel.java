package ss3_arraya_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementDel {
    public static void main(String[] args) {
        int[] myArray = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println(Arrays.toString(myArray));
        Scanner scn = new Scanner(System.in);
        int index_del;
        System.out.println("enter element delete:");
        index_del = scn.nextInt();
        int[] newArray = delElement(myArray, index_del);
        System.out.println("newArray = " + Arrays.toString(newArray));
    }
    public static int[] delElement(int[] array,int index){
        int i, j;
        for (i = 0; i < array.length; i++){
            if (index == array[i]){
                for (j = i; j < array.length-1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        return array;
    }
}
