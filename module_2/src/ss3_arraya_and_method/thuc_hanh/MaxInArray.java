package ss3_arraya_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        double[] array = new double[20];
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the money:");
        for (int i  = 0; i < array.length; i++){
            array[i] = scn.nextDouble();
        }
        System.out.println("money array = " + Arrays.toString(array));
        double max = array[0];
        int j;
        for (j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
            }
        }
        System.out.println("max money = " + max);
    }
}
