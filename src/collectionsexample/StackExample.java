package collectionsexample;

import java.util.Stack;

/**
 * @author Yuri Serrano
 */
public class StackExample {
    /**
     * @param args {@link String[]} - The command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 10 ; i++) {
            stack.push(i);
        }

        while(!stack.empty()){
            System.out.print(stack.pop());
            System.out.print(",");
        }

        System.out.println("LIFT-OFF!!!!");

    }
}
