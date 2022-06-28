package ss17_binary_file_serialization.thuc_hanh.thuc_hanh_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mains {
    public static void writeToObject(List<Student> students, String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readToObject(String path){
        List<Student> list = new ArrayList<>();
        try {
            FileInputStream fi = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fi);
            list = (List<Student>)ois.readObject();
            ois.close();
            fi.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"hong son","nghe an"));
        list.add(new Student(2,"nhu quynh","da nang"));
        list.add(new Student(3,"minh anh","bac ninh"));
        list.add(new Student(4,"hoang men","nghe an"));
        list.add(new Student(5,"thuong kiet","ha noi"));

        writeToObject(list,"src/ss17_binary_file_serialization/thuc_hanh/thuc_hanh_2/student.txt");
        List<Student> studentList = readToObject("src/ss17_binary_file_serialization/thuc_hanh/thuc_hanh_2/student.txt");
        for(Student s: studentList){
            System.out.println(s);
        }
    }
}
