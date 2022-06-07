package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HelloPeople {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name = input.nextLine();
        System.out.println("Hello ! " + name);
    }
}
