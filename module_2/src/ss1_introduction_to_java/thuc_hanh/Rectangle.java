package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = input.nextFloat();
        System.out.println("Enter height: ");
        height = input.nextFloat();
        float area = width * height;
        System.out.println("Area of Rectangle = " + area);
    }
}
