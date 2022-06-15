package ss7_abtraction_and_interface.bai_tap.bai_tap_2;

import ss7_abtraction_and_interface.bai_tap.bai_tap_1.Circle;
import ss7_abtraction_and_interface.bai_tap.bai_tap_1.Rectangle;
import ss7_abtraction_and_interface.bai_tap.bai_tap_1.Shapes;
import ss7_abtraction_and_interface.bai_tap.bai_tap_1.Square;

public class TestColor {
    public static void main(String[] args) {
        Shapes[] sha = new Shapes[4];
        sha[0] = new Circle(1.0);
        sha[1] = new Rectangle(1.0,2.0);
        sha[2] = new Square(1.0);
        sha[3] = new Square(2.0);

        for (Shapes s1:sha) {
            if (s1 instanceof Square){
                System.out.println("Area of Square = " + s1.getArea());
                Square s2 = (Square) s1;
                s2.howToColor();
            }
        }
    }
}
