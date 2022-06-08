package ss3_arraya_and_method.thuc_hanh;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scn = new Scanner(System.in);
        String std;
        System.out.println("enter student name:");
        std = scn.nextLine();
        boolean flg = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(std)) {
                flg = true;
                System.out.println("student name: " + i);
                break;
            }
        }
        if (!flg){
            System.out.println("not found student name1");
        }
    }
}
