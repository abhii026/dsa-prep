// STACK USNIG ARRAY
public class stack {

    private int top = -1;
    private int size;
    private int[] st;

    public stack(int s) {
        this.size = s;
        st = new int[size];
    }

    // Push
    public void push(int element) {
        if (!isFull()) {
            st[++top] = element;
            System.out.println("Element Inserted.");
        } else {
            System.out.println("Stack is full");
        }
    }

    // Pop
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Deleted element: " + st[top--]);
    }

    // Peek
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Peek element: " + st[top]);
    }

    // Current number of elements
    public void size_stack() {
        System.out.println("Current size: " + (top + 1));
    }
    
    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(st[i]);
        }
    }

    // Check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check full
    public boolean isFull() {
        return top == size - 1;
    }
}
