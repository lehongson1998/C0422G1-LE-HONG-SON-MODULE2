package ss3_arraya_and_method.thuc_hanh;

import java.util.Scanner;

public class ChangeCelsius {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int changer;
        double f, c;
        do {
            System.out.println("CHANGE CELSIUS!");
            System.out.println("1 | Fahrenheit to Celsius!");
            System.out.println("2 | Celsius to Fahrenheit!");
            System.out.println("0 | Exit!");
            changer = scn.nextInt();
            switch (changer) {
                case 1:
                    System.out.println("enter Fahrenheit:");
                    f = scn.nextDouble();
                    System.out.println(f + "fahrenheit = " + fahrenheitTOCelsius(f) + " celsius.");
                    break;
                case 2:
                    System.out.println("enter Celsius:");
                    c = scn.nextDouble();
                    System.out.println(c + " celsius = " + celsiusToFahrenheit(c) + "fahrenheit.");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("warning!!!!!!!!!!!!!!!!!");
            }
        } while (changer != 0);
    }
    public static double fahrenheitTOCelsius( double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }
}
