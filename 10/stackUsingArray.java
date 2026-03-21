class ArrayStack {
    int[] arr;
    int top;
    int capacity;

    // Constructor
    ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation
    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check full
    boolean isFull() {
        return top == capacity - 1;
    }
}

public class stackUsingArray {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek()); // Output: 30
        System.out.println("Popped element is: " + stack.pop()); // Output: 30
        System.out.println("Top element after pop is: " + stack.peek()); // Output: 20
    }
}