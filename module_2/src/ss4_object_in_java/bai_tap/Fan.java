package ss4_object_in_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        radius = 5.0;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String fans() {
        if (!isOn()) {
            return "Fan is Off" + "\n" + "Color: " + this.getColor() + "\n" + "Radius: " + this.getRadius();
        } else {
            return "Fan is On\n" + "Speed: " + this.getSpeed() + "\nColor: " + this.getColor() + "\nRadius: " + this.getRadius();
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setRadius(10.0);
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        System.out.println(fan1.fans());
        System.out.println("===========================================================");
        Fan fan2 = new Fan();
        System.out.println(fan2.fans());
    }
}
