package ss2_loop_of_java.bai_tap;

public class PrimeThen100 {
    public static void main(String[] args) {
        int prime = 2, count;
        System.out.println("prime < 100!");
        while (prime < 100){
            count = 0;
            for (int i = 1; i <= prime; i++){
                if (prime % i == 0){
                    count++;
                }
            }if (count == 2){
                System.out.println(prime);
            }
            prime++;
        }
    }
}
