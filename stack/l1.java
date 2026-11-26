import java.util.*;

public class l1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int s = in.nextInt();

        stack s1 = new stack(s);

        while (true) {

            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Current Size");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int element = in.nextInt();
                    s1.push(element);
                    break;

                case 2:
                    s1.pop();
                    break;

                case 3:
                    s1.peek();
                    break;

                case 4:
                    s1.size_stack();
                    break;

                case 5:
                    s1.display();
                    break;

                case 6:
                    System.out.println("Program Exited.");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}