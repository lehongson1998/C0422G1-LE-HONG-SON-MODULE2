package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 2.0;
        color = "green";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public double getArea () {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "circle of radius = "
                + getRadius()
                + " circle of area = "
                + getArea()
                + " color: "
                + getColor();
    }

    public static void main(String[] args) {
        Circle crc = new Circle(1.0, "green");
        System.out.println(crc);
    }
}
