package ss5_static_and_private.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "red");
        bmw.display();
        Car vinFast = new Car("luxury", "blue");
        vinFast.display();
        Car vinFast2 = new Car("luxA2.0", "white");
        vinFast2.display();
    }
}
