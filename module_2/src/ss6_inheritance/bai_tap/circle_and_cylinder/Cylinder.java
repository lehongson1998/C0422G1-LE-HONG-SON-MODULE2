package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height = 1.0;
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder (double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * this.height;
    }
    @Override
    public String toString() {
        return "Cylinder of Height = "
                + getHeight()
                + super.toString()
                + " Cylinder of Volume = "
                + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0, 2.0, "black");
        System.out.println(cylinder);

        Cylinder cr = new Cylinder();
        System.out.println(cr);

        Cylinder cr2 = new Cylinder(3.0);
        System.out.println(cr2);

        Cylinder cr3 = new Cylinder();
        cr3.setRadius(2.0);
        cr3.setColor("white");
        cr3.setHeight(3.1);
        System.out.println(cr3);
    }
}
