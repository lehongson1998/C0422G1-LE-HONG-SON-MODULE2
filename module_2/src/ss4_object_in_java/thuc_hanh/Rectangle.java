package ss4_object_in_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    void setWidth(double width){
        this.width = width;
    }
    void setHeight(double height){
        this.height = height;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(1.5, 2.5);
        System.out.println("area = " + rectangle.getArea());
        System.out.println("perimeter = " + rectangle.getPerimeter());
        System.out.println("enter new Width");
        double w = input.nextDouble();
        System.out.println("enter new Height");
        double h = input.nextDouble();
        rectangle.setWidth(w);
        rectangle.setHeight(h);
        System.out.println("new Area = " + rectangle.getArea());
        System.out.println("new Perimeter = " + rectangle.getPerimeter());
    }
}
