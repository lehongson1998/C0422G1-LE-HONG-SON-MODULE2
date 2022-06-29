package ss18_string_regex.thuc_hanh.thuc_hanh_1;

public class Email {
    public static void main(String[] args) {
        String regexEmail = "^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";
        String email1 = "lhongson2909@gmail.com";
        String email2 = "@gmail.com";
        boolean b = email1.matches(regexEmail);
        System.out.println(email1 + ":" + b);
        boolean b2 = email2.matches(regexEmail);
        System.out.println(email2 + ":" + b2);
    }
}
