package ss7_abtraction_and_interface.bai_tap.bai_tap_1;

import ss7_abtraction_and_interface.bai_tap.bai_tap_2.Colorable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void howToColor() {
    }
}
