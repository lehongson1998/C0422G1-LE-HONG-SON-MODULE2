package ss11_stack_queue.bai_tap.bai_tap_2;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = Integer.parseInt(input.nextLine());
        int result;
        while (number != 0){
            result = number % 2;
            binary.push(result);
            number /= 2;
        }

        for (int i = binary.size(); i > 0 ; i--){
            System.out.println(binary.pop());
        }
    }
}
