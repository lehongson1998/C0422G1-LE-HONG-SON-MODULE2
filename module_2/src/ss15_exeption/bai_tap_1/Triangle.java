package ss15_exeption.bai_tap_1;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle(int a, int b, int c) throws TriangleException {
        if (a < 1 || b < 1 || c < 1) {
            throw new TriangleException("cạnh nhỏ hơn 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleException("tong 2 canh khong lon hon canh con lai ");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
