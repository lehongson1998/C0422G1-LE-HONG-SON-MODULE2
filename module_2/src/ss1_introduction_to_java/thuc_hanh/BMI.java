package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height : ");
        height = input.nextDouble();
        System.out.println("enter the weight : ");
        weight = input.nextDouble();
        bmi = weight / (height * height);
        if (bmi < 18.0){
            System.out.println("bmi = " + bmi + " Underweight");
        }else if (bmi < 25.0){
            System.out.println("bmi = " + bmi + " Normal");
        }else if (bmi < 30.0){
            System.out.println("bmi = " + bmi + " Overweight");
        }else {
            System.out.println("bmi = " + bmi + " Obese");
        }
    }
}
