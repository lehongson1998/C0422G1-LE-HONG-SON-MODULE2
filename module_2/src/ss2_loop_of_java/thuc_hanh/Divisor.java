package ss2_loop_of_java.thuc_hanh;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number A:");
        a = input.nextInt();
        System.out.println("enter number B:");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor!");
        } else {
            int max = 0, i;
            for (i = a; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                    break;
                }
            }
            System.out.println("max common factor = " + max);
        }
    }
}
