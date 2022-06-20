package draft;

public class DemoClass {
    public int i = 1;
    public static int del = 0;

    public DemoClass() {
        this.del++;
    }
    public void display(){
        System.out.println(del);
    }

    public static double area(double a, double b){
        return a * b;
    }
    public static void main(String[] args) {
        DemoClass d = new DemoClass();
        d.display();
        System.out.println(d);
        DemoClass d2 = new DemoClass();
        System.out.println(d2);
        System.out.println(DemoClass.area(1,6));
        d2.display();
    }
}
