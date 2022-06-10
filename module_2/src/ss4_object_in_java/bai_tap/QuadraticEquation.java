package ss4_object_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    // QuadraticEquation Ax2 + bx + c = 0;
    private int a;
    private int b;
    private int c;
    QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
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
        int a, b, c;
        System.out.println("enter a, b, c :");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("a =" + equation.getA());
        System.out.println("b =" + equation.getB());
        System.out.println("c =" + equation.getC());
        equation.equal();
    }
}
