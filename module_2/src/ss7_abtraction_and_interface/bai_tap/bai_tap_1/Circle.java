package ss7_abtraction_and_interface.bai_tap.bai_tap_1;

public class Circle extends Shapes implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    @Override
    public double getPerimeter() {
        return (radius * 2 * Math.PI);
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius +
                ",Area = " + getArea() +
                ",Perimeter = " + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent/100;
    }

    public static void main(String[] args) {
        Circle c = new Circle(1.0);
        System.out.println(c.getArea());
        c.resize(100);
        System.out.println(c.getArea());
    }
}
