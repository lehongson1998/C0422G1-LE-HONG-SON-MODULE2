package ss3_arraya_and_method.bai_tap;

import java.util.Scanner;

public class CharOfString {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string:");
        str = scanner.nextLine();
        System.out.println(str);
        System.out.println("enter a 1 character:");
        char s = scanner.nextLine().charAt(0);
        int i, count = 0;
        for (i = 0; i < str.length(); i++){
            if (str.charAt(i) == s){
                count++;
            }
        }
        System.out.println("char (" + s + ") appear " + count);
    }
}
