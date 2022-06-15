package ss7_abtraction_and_interface.bai_tap.bai_tap_1;

public class Test {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Circle(1.0);
        shapes[1] = new Rectangle(1.0,2.0);
        shapes[2] = new Square(1.0);
        for (Shapes s:shapes) {
            System.out.println("before Area =" + s.getArea());
            if (s instanceof Circle){
                Circle cr = (Circle) s;
                cr.resize(Math.floor(Math.random() * 100 + 1));
                System.out.println("After of Circle Area = " + cr.getArea());
            }else if (s instanceof Rectangle){
                Rectangle rg = (Rectangle) s;
                rg.resize(Math.floor(Math.random() * 100 + 1));
                System.out.println("After of Rectangle Area = " + rg.getArea());
            }else{
                Square sq = (Square) s;
                sq.resize(Math.floor(Math.random() * 100 + 1));
                System.out.println("After of Square Area = " + sq.getArea());
            }
        }
    }
}