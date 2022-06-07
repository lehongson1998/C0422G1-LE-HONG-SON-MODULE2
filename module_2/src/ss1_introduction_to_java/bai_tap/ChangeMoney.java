package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double usd,vnd, rate = 23000.0;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter USD:");
        usd = enter.nextDouble();
        vnd = usd * rate;
        System.out.println(usd + "USD = " + vnd + "VND");
    }
}
