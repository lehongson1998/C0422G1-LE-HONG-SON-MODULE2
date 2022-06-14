package ss6_inheritance.bai_tap.point_and_moveablepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] array = {x, y};
        return  array;
    }
    @Override
    public String toString() {
        return "(x, y): "
                +"x = "
                +x
                + ",y = "
                +y;
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.setX(1.1f);
        point.setY(1.1f);
        System.out.println(point);

        Point p2 = new Point(2.0f, 10.1f);
        System.out.println(p2);
    }
}
