import java.util.*;
public class basicOfStack {

    // stack class vs deque 
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // Using Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack); // Output: [1, 2, 3]
        System.out.println("Stack pop: " + stack.pop()); // Output: 3
        System.out.println("Stack after pop: " + stack); // Output: [1, 2]

        // Using Deque as a Stack
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("Deque as Stack: " + deque); // Output: [3, 2, 1]
        System.out.println("Deque pop: " + deque.pop()); // Output: 3
        System.out.println("Deque after pop: " + deque); // Output: [2, 1]
        /* Why Deque?
            -   Faster
            -   Modern replacement
            -   Preferred in LeetCode discussions
        */


        
        // push, pop , peek, isEmpty, size, search
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(10);    
        stack2.push(20);
        stack2.push(30);
        System.out.println("Top element (peek): " + stack2.peek()); // Output: 30
        System.out.println("Stack size: " + stack2.size()); // Output: 3        
        System.out.println("Is stack empty? " + stack2.isEmpty()); // Output: false
        System.out.println("Position of 20 (search): " + stack2.search(20)); // Output: 2
        System.out.println("Stack pop: " + stack2.pop()); // Output: 30
        System.out.println("Stack after pop: " + stack2); // Output: [10, 20]

        Stack<Integer> stack3 = new Stack<>();
        stack3.push(100);


        Stack<Character> stack4 = new Stack<>();
        stack4.push('A');
        stack4.push('z');
        stack4.push('0');
        stack4.push('@');
        stack4.push(' ');
        stack4.push('(');
        stack4.push(')');
        stack4.push('#');

        Stack<String> stack5 = new Stack<>();
        stack5.push("Hello");
        stack5.push("World");




        
        // stack with string working (for balanced parentheses)
        String s = "({[]})";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    System.out.println("Not balanced");
                    return;
                }
                char top = st.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    System.out.println("Not balanced");
                    return;
                }
            }
        }


    }
}
