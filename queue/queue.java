
public class queue {

    private int front = -1;
    private int rare = -1;
    private int size;
    private int[] qu;

    queue(int s) {
        this.size = s;
        qu = new int[size];
    }

    // ENQUEUE
    public void push(int element) {

        if (rare == size - 1) {
            System.out.println("Queue is full.");
            return;
        }

        if (front == -1 && rare == -1) {
            front = 0;
        }

        qu[++rare] = element;
        System.out.println("Element Inserted.");
    }

    // DEQUEUE
    public void pop() {

        if (front == -1) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("Deleted element: " + qu[front]);

        for (int i = 0; i < rare; i++) {
            qu[i] = qu[i + 1];
        }

        rare--;

        if (rare == -1) {
            front = -1;
        }
    }

    // PEEK
    public void top() {

        if (front == -1) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("Front element: " + qu[front]);
    }

    // CURRENT SIZE
    public void size() {
        System.out.println("Current size: " + (rare + 1));
    }

    // DISPLAY
    public void display() {

        if (front == -1) {
            System.out.println("Queue is Empty.");
            return;
        }

        for (int i = front; i <= rare; i++) {
            System.out.println(qu[i]);
        }
    }
}
