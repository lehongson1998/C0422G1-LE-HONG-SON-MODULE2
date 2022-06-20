package ss11_stack_queue.bai_tap.bai_tap_3;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the String:");
        str = input.nextLine();

        String[] strArr = str.split("");
        Stack stack = new Stack();
        Queue queue = new ArrayDeque();

        for (int i = 0; i < strArr.length; i++) {
            stack.add(strArr[i]);
            queue.add(strArr[i]);
        }
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(queue);
        boolean flag = true;
        for (int i =0; i <strArr.length ; i++) {
            if (stack.pop().equals(queue.poll())){
            continue;
            }else {
               flag = false;
                break;
            }
        }
        System.out.println(stack);
        System.out.println(queue);
        if (flag){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
