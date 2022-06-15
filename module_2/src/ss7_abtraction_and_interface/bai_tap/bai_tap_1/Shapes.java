package ss7_abtraction_and_interface.bai_tap.bai_tap_1;

public abstract class Shapes {
    private String color = "red";
    private boolean filled = false;

    public Shapes() {
    }

    public Shapes(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String filled(){
        if (!isFilled()){
            return "Filled";
        }else{
            return "Not Filled";
        }
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return  "color='" + color + '\'' +
                ", filled=" + filled();
    }
}
