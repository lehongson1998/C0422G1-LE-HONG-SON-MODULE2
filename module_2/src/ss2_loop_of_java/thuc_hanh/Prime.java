package ss2_loop_of_java.thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = input.nextInt();
        int i, count = 0;
        if (number >= 2){
            for (i = 1; i <= number; i++){
                if (number % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println("number: " + number + " is a Prime!");
            }else {
                System.out.println("number: " + number + " is not a Prime!");
            }
        }else {
            System.out.println("enter new number >= 2!");
        }
    }
}
