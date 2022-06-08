package ss3_arraya_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 4;
        myArray[3] = 5;
        myArray[4] = 6;
        System.out.println("old array = " + Arrays.toString(myArray));
        Scanner snc = new Scanner(System.in);
        int index_push, location;
        System.out.println("enter element push:");
        index_push = snc.nextInt();
        System.out.println("enter location push:");
        location = snc.nextInt();
        int i, j;
        for (i = 0; i < myArray.length; i++) {
            if (location == i) {
                for (j = myArray.length - 1; j > i; j--) {
                    myArray[j] = myArray[j - 1];
                }
                myArray[i] = index_push;
            }
        }
        System.out.println("new array = " + Arrays.toString(myArray));
    }
}
