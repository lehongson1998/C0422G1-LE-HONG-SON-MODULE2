package ss12_colection_map.thuc_hanh.thuc_hanh_2;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Hong Son",24,"Nghe An");
        Student std2 = new Student("Nhu Quynh", 20,"Da Nang");
        Student std3 = new Student("Quang Ha",22,"Nghe An");

        Map<Integer,Student> map = new HashMap<>();
        map.put(1,std1);
        map.put(2,std2);
        map.put(3,std3);
        map.put(4,std1);

        for (Map.Entry<Integer,Student> student: map.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("================================================");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(std1);
        studentSet.add(std2);
        studentSet.add(std3);
        studentSet.add(std1);

        for(Student student: studentSet){
            System.out.println(student.toString());
        }

    }
}
