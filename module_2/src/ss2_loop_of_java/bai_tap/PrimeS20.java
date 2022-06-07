package ss2_loop_of_java.bai_tap;


public class PrimeS20 {
    public static void main(String[] args) {
        System.out.println("20 PRIME!");
        int prime = 2, count = 0, tmp;
        while (count < 20){
            tmp = 0;
            for (int i = 1; i <= prime; i++){
                if (prime % i == 0){
                    tmp++;
                }
            }if (tmp == 2){
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
}
