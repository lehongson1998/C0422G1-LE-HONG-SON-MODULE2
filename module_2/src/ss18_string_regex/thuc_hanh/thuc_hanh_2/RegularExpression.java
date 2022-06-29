package ss18_string_regex.thuc_hanh.thuc_hanh_2;

public class RegularExpression {
    public static void checkRegex(String[] account){
        String regexAccount = "^[_a-z0-9]{6,}$";
        boolean b;
        for (int i = 0; i < account.length; i++) {
            b = account[i].matches(regexAccount);
            System.out.println(account[i] + ":" + b);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"123abc_", "_abc123", "______", "123456","abcdefgh" };
        String[] arr2 = { ".@", "12345", "1234_", "abcde"};
        RegularExpression.checkRegex(arr);
        RegularExpression.checkRegex(arr2);
    }
}
