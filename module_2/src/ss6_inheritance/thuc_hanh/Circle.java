package ss6_inheritance.thuc_hanh;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }
    @Override
    public String toString(){
        return  "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle crc = new Circle(1.0,"rec", true);
        System.out.println(crc);
    }
}
