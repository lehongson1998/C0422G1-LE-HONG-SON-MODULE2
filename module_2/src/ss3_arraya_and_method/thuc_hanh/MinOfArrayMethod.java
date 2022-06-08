package ss3_arraya_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class MinOfArrayMethod {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = input.nextInt();
        }
        System.out.println("MyArray = " + Arrays.toString(myArray));
        System.out.println("min of array = " + min(myArray));
    }
    public static int min(int[] array){
        int min = array[0];
        int j;
        for (j = 0; j < array.length; j++){
            if (array[j] < min){
                min = array[j];
            }
        }
        return min;
    }
}
