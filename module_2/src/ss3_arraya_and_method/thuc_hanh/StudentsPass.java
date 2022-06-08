package ss3_arraya_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, count = 0;
        do {
            int i, j;
            System.out.println("enter a size:");
            size = input.nextInt();
            if (size <= 30 && size > 0) {
                double[] array = new double[size];
                for (i = 0; i < array.length; i++) {
                    System.out.println("enter point of student " + (i + 1));
                    array[i] = input.nextDouble();
                }
                System.out.println("point of " + size + " student: " + Arrays.toString(array));
                for (j = 0; j < array.length; j++) {
                    if (array[j] > 5 && array[j] < 10){
                        count++;
                    }
                }
                System.out.println("The number of students passing the exam is " + count);
            }
        } while (size > 30);
    }
}
