package ss6_inheritance.bai_tap.triangle_and_shape;

import java.util.Scanner;

// triangle là lớp con của Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ",Perimeter = "
                + getPerimeter()
                + ",Area = "
                + getArea() +"," +
                super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Triangle triangle1 = new Triangle();

        System.out.println("nhập vào độ dài 3 cạnh của tam giác:");

        triangle1.setSide1(scn.nextDouble());
        triangle1.setSide2(scn.nextDouble());
        triangle1.setSide3(scn.nextDouble());

        triangle1.setColor("red");
        triangle1.setFilled(false);
        System.out.println(triangle1);

    }
}
