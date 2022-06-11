package ss4_object_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    // QuadraticEquation Ax2 + bx + c = 0;
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    double getDiscriminant(){
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }
    double getRoot1(){
        return (-(this.b) + Math.sqrt(getDiscriminant())) / (2*a);
    }
    double getRoot2(){
        return (-(this.b) - Math.sqrt(getDiscriminant())) / (2*this.a);
    }
    public void equal(){
        if (this.getDiscriminant() > 0){
            System.out.println("x1 = " + this.getRoot1());
            System.out.println("x2 = " + this.getRoot2());
        }else if(this.getDiscriminant() == 0){
            System.out.println("x = " + this.getRoot1());
        }else{
            System.out.println("not equation!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a, b, c :");
        QuadraticEquation equation = new QuadraticEquation(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("a =" + equation.getA());
        System.out.println("b =" + equation.getB());
        System.out.println("c =" + equation.getC());
        equation.equal();
    }
}
