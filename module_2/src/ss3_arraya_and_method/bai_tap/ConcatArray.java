package ss3_arraya_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[array2.length + array2.length];
        Scanner input = new Scanner(System.in);
        System.out.println("enter element array 1:");
        int n, l, i, j;
        for (i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("array1 = " + Arrays.toString(array1));
        for (j = 0; j < array2.length; j++) {
            array2[j] = input.nextInt();
        }
        System.out.println("array2 = " + Arrays.toString(array2));

        for (n = 0; n < array1.length; n++) {
            array3[n] = array1[n];
        }
        for (l = 0; l < array2.length; l++) {
            array3[array1.length + l] = array2[l];
        }
        System.out.println("array3 = " + Arrays.toString(array3));
    }
}
