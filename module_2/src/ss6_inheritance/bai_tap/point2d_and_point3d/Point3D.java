package ss6_inheritance.bai_tap.point2d_and_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ () {
        float[] array = {this.getX(), this.getY(), this.z};
        return array;
    }
    public String toString() {
        return "(x, y, z) = "
                +getXYZ()[0]
                + ";"
                +getXYZ()[1]
                + ";"
                +getXYZ()[2];
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.1f, 1.2f, 1.3f);
        System.out.println("point3D:" + point3D);

        Point3D pd3d = new Point3D(9.0f);
        System.out.println("pd3d:" + pd3d);
    }
}
