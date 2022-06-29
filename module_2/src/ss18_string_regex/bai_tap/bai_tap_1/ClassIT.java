package ss18_string_regex.bai_tap.bai_tap_1;

public class ClassIT {
    public static void checkClass(String className){
        String regexClass = "^[C|A|P][0-9]{4}[G|H|I|K|L|M]$";
        boolean b = className.matches(regexClass);
        System.out.println(className + ":" + b);
    }

    public static void main(String[] args) {
        String cl1 = "C0422G";
        ClassIT.checkClass(cl1);
        String cl2 = "PP0422H";
        ClassIT.checkClass(cl2);
    }
}
