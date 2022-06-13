package ss5_static_and_private.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student std = new Student(1998, "son");
        std.display();
        System.out.println("=========================");
        Student std2 = new Student();
        std2.rol = 2001;
        std2.name = "ken";
        std2.display();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        System.out.println("---------------------------");
        s1.display();
        System.out.println("---------------------------");
        s2.display();
        System.out.println("---------------------------");
        s3.display();
    }
}
