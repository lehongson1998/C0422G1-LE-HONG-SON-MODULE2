package ss4_object_in_java.bai_tap;

import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW ;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {

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
    public String fans(){
        if (!isOn()){
            return "Fan is Off" + "\n" + "Color: " + this.getColor() + "\n" + "Radius: " + this.getRadius();
        }else{
           return "Fan is On\n" + "Speed: " + this.getSpeed() +"\nColor: " + this.getColor() + "\nRadius: " + this.getRadius();
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Fan fan = new Fan();
        fan.setRadius(5.0);
        fan.setColor("Yellow");
        System.out.println("ON or Off Fan:");
        boolean b = ip.nextBoolean();
        fan.setOn(b);
        System.out.println("nhập tốc độ quạt");
        int i = ip.nextInt();
        switch (i){
            case 1:
                fan.setSpeed(fan.SLOW);
                break;
            case 2:
                fan.setSpeed(fan.MEDIUM);
                break;
            case 3:
                fan.setSpeed(fan.FAST);
                break;
            default:
                System.out.println("vui lòng nhập lại");
        }
        System.out.println(fan.fans());
    }
}
