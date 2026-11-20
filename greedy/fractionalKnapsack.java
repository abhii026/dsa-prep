import java.util.*;

class Node {
    int weight;
    int value;
    double ratio;

    Node(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class fractionalKnapsack {

    static double total(int w, ArrayList<Node> nd) {

        double ans = 0.0;

        // Calculate profit/weight ratio
        for (int i = 0; i < nd.size(); i++) {
            nd.get(i).ratio =
                (double) nd.get(i).value / nd.get(i).weight;
        }

        // Sort in descending order of ratio
        nd.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        // Apply Greedy Approach
        for (Node e : nd) {

            if (w == 0) {
                break;
            }

            // Take complete item
            if (e.weight <= w) {
                ans += e.value;
                w -= e.weight;
            }

            // Take fractional item
            else {
                double frac = (double) w / e.weight;
                ans += frac * e.value;
                w = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();

        ArrayList<Node> nd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int value = sc.nextInt();

            nd.add(new Node(weight, value));
        }

        System.out.printf("%.2f", total(w, nd));

        sc.close();
    }
}
