package ss6_inheritance.bai_tap.point2d_and_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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
    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array = {this.x, this.y};
        return array;
    }
    public String toString () {
        return "(x,y) = "
                + getXY()[0]
                +";"
                + getXY()[1];
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(0.1f, 1.5f);
        System.out.println(point2D);
        point2D.setXY(3.0f, 4.0f);
        System.out.println(point2D);

        Point2D p2d = new Point2D();
        p2d.setX(100.0f);
        System.out.println(p2d);
    }
}
