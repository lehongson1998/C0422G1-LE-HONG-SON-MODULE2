package ss3_arraya_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length:");
        int n = input.nextInt();
        int[] array = new int[n];
        int i;
        System.out.println("enter element of array:");
        for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("array = " + Arrays.toString(array));
        int min = array[0], j;
        for (j = 0; j < array.length; j++){
            if (array[j] < min){
                min = array[j];
            }
        }
        System.out.println("Min = " + min);
    }
}
