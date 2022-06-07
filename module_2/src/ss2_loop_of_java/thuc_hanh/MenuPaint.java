package ss2_loop_of_java.thuc_hanh;

import java.util.Scanner;

public class MenuPaint {
    public static void main(String[] args) {
        char c = '*';
        int i, j;
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1:draw a right triangle");
            System.out.println("2:draw a rectangle");
            System.out.println("3:draw a square");
            System.out.println("0:exit!");
            System.out.println("enter a number:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (i = 1; i <= 10; i++) {
                        for (j = 10; j >= i; j--) {
                            System.out.print(c + "  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (i = 1; i <= 5; i++){
                        for (j = 1; j <= 10; j++){
                            System.out.print(c + "  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (i = 1; i <= 10; i++){
                        for (j = 1; j <= 10; j++){
                            System.out.print(c + "  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("no choice!!!!");
            }
        }
    }
}
