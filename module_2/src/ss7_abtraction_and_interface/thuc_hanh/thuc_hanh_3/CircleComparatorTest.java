package ss7_abtraction_and_interface.thuc_hanh.thuc_hanh_3;

import ss6_inheritance.thuc_hanh.Circle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] crc1 = new Circle[3];
        crc1[0] = new Circle(1.8);
        crc1[1] = new Circle();
        crc1[2] = new Circle(5.9, "black" , false);

        for (Circle c: crc1) {
            System.out.println(c);
        }
        CircleComparator crc2 = new CircleComparator();
        Arrays.sort(crc1, crc2);

        for (Circle c1: crc1) {
            System.out.println(c1);
        }
    }
}
