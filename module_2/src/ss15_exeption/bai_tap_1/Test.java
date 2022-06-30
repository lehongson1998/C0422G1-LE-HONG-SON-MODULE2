package ss15_exeption.bai_tap_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        do {
            try {
                System.out.println("Enter a");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter b");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter c");
                int c = Integer.parseInt(scanner.nextLine());
                triangle = new Triangle(a, b, c);
                break;
            } catch (TriangleException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e){
                System.err.println(e.getMessage());
            }
        } while (true);
        System.out.println(triangle.getA());
    }
}
