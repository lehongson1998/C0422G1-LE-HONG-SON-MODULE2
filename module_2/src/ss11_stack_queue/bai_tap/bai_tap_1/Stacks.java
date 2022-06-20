package ss11_stack_queue.bai_tap.bai_tap_1;
import java.util.Scanner;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Stack<Integer> wStack = new Stack<>();
        wStack.push(1);
        wStack.push(2);
        wStack.push(3);
        wStack.push(4);
        wStack.push(5);

        Stack<Integer> wStack2 = new Stack<>();

        for (int i = wStack.size(); i > 0; i--) {
            wStack2.push(wStack.pop());
        }

        for (int i = wStack2.size(); i > 0; i--) {
            System.out.println(wStack2.pop());
        }

        Stack<String> wStack3 = new Stack<>();
        System.out.println("enter String:");
        String mWord = sn.nextLine();
        String[] words = mWord.split("");
        System.out.println("=============================================");
        for (int i = words.length - 1; i >= 0; i--) {
            wStack3.push(words[i]);
        }

        for (int i = wStack3.size(); i > 0 ; i--) {
            System.out.println(wStack3.pop());
        }
    }
}
