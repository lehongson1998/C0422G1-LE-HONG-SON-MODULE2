package ss8_cleancode.thuc_hanh;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    public static double getArea(int radius){
        return (Math.pow(radius,2)) * Math.PI;
    }
    public static double getPerimeter(int radius){
        return radius * 2 * Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(getVolume(1,2));
    }
}
