package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        // equation : ax + b = 0;
        System.out.println("Equation ax + b = 0");
        double a, b, x;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number A :");
        a = input.nextDouble();
        System.out.println("Enter number B :");
        b = input.nextDouble();
        if (a != 0){
            x = -b / a;
            System.out.println("phuong trinh co 1 nghiem = " + x);
        }else if (b == 0){
            System.out.println("pt vo so nghiem !");
        }else{
            System.out.println("pt vo nghiem!");
        }
    }
}
