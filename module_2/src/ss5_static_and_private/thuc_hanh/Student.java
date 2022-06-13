package ss5_static_and_private.thuc_hanh;

public class Student {
    public int rol;
    public String name;
    public static String college = "Animation";

    public Student() {
    }
    public Student(int rol, String name) {
        this.rol = rol;
        this.name = name;
    }
    public static void change(){
        college = "code gym";
    }
    public void display(){
        System.out.println("name: " + this.name + "\nrol: " + this.rol + "\ncollege:" + college);
    }
}
