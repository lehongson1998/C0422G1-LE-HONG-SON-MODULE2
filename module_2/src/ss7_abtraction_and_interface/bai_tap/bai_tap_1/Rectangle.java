package ss7_abtraction_and_interface.bai_tap.bai_tap_1;


public class Rectangle extends Shapes implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea () {
        return this.width * this.length;
    }
    public double getPerimeter () {
        return (this.width + this.length) * 2;
    }
    @Override
    public String toString() {
        return  "Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ","
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        width += width * percent/100;
        length += length * percent/100;
    }

    public static void main(String[] args) {
        Rectangle rtg = new Rectangle(1.0, 2.0, "black", false);
        System.out.println("before Area = " + rtg.getArea());
        //rtg.resize(Math.floor(Math.random()* 100 + 1));
        rtg.resize(100);
        System.out.println("after Area = " + rtg.getArea());
    }
}
