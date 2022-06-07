package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Month :");
        month = input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("month : " + month + " have 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("month : " + month + " have 30 day");
                break;
            case 2:
                System.out.println("month : " + month + " have 28 or 29 day");
                break;
            default:
                System.out.println("not this is month!!!!");
        }

    }
}
