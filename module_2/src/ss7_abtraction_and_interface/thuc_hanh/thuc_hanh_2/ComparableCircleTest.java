package ss7_abtraction_and_interface.thuc_hanh.thuc_hanh_2;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] crc = new ComparableCircle[3];
        crc[0] = new ComparableCircle(3.6);
        crc[1] = new ComparableCircle();
        crc[2] = new ComparableCircle(3.6,"red", true);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : crc) {
            System.out.println(circle);
        }

        Arrays.sort(crc);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : crc) {
            System.out.println(circle);
        }

    }
}
