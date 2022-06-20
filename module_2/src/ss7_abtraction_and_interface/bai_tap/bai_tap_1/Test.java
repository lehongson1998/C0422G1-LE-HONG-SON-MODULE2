package ss7_abtraction_and_interface.bai_tap.bai_tap_1;

public class Test {
    public static void main(String[] args) {
        double p = Math.floor(Math.random() * 100 + 1);
        Shapes[] array = new Shapes[3];
        array[0] = new Circle();
        array[1] = new Rectangle();
        array[2] = new Square();
        for (Shapes s: array) {
            System.out.println("before area = " + s.getArea());
            if (s instanceof Circle){
                Circle cr = (Circle) s;
                cr.resize(p);
                System.out.println("after area of Circle = " + cr.getArea());
            }if (s instanceof Rectangle){
                Rectangle rg = (Rectangle)s;
                rg.resize(p);
                System.out.println("after area of Rectangle = " + rg.getArea());
            }if (s instanceof Square){
                Square sq = (Square)s;
                sq.resize(p);
                System.out.println("after area of Square = " + sq.getArea());
            }
        }
    }
}