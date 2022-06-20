package ss7_abtraction_and_interface.bai_tap.bai_tap_1;

public class Circle extends Shapes implements Resizeable{
   private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    public double getPerimeter(){
        return (radius * 2 * Math.PI);
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent/100;
    }
}
