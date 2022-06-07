package ss2_loop_of_java.thuc_hanh;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double money, interest, totalMoney = 0;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("enter start money:");
        money = input.nextDouble();
        System.out.println("enter the interest:");
        interest = input.nextDouble();
        System.out.println("enter month:");
        month = input.nextInt();
        for (int i = 1; i <= month; i++){
            totalMoney += (money * (interest/100)) / 12 * month;
        }
        System.out.println("total money of " + month + " :" + totalMoney + "VND");
    }
}
