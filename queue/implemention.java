import java.util.*;

public class implemention {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = in.nextInt();
        queue q1=new queue(size);

        while(true){
            System.out.println("\n--- Queue Operations ---");
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
                    System.out.print("Enter element to insert: ");
                    int e=in.nextInt();
                    q1.push(e);
                    break;
                case 2:
                    q1.pop();
                    break;
                case 3:
                    q1.top();
                    break;
                case 4:
                    q1.size();
                    break;
                case 5:
                    q1.display();
                    break;
                case 6:
                    System.out.println("Program Exited.");
                    return;
                default:
                    break;
            }
        }

    }
}