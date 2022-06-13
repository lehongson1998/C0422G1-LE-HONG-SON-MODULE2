package ss5_static_and_private.thuc_hanh;

public class Car {
    public String name;
    public String color;
    public static int numberOfCar;
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        numberOfCar++;
    }
    public void display(){
        System.out.println("name:" + this.name + "\nColor: " + this.color + "\nNumber of car: " + numberOfCar);
    }
}
