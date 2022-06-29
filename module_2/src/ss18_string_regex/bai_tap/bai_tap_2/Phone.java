package ss18_string_regex.bai_tap.bai_tap_2;

public class Phone {
    public static void checkPhoneNumber(String number){
        String phone = "^\\(([0-9]{2})\\)-\\(0([0-9]{9})\\)$";
        boolean flag = number.matches(phone);
        System.out.println(number + ":" + flag);
    }

    public static void main(String[] args) {
        String phoneNumber = "(84)-(0971450138)";
        Phone.checkPhoneNumber(phoneNumber);
    }
}
