import java.util.Scanner;

public class KMP {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = in.next();

        System.out.print("Enter pattern: ");
        String pattern = in.next();

        int res = KMPalgo(text, pattern);
        if (res != -1) {
            System.out.println("Pattern found at index: " + res);
        } else {
            System.out.println("Pattern not found");
        }

        in.close();
    }
    static int KMPalgo(String t, String p) {

        int n = t.length();
        int m = p.length();
        int[] lps = createLPS(p);

        int i = 0;
        int j = 0;

        while (i < n) {

            if (t.charAt(i) == p.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    return i - j;
                }
            }
            else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }
    static int[] createLPS(String p) {
        int m = p.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        while (i < m) {
            if (p.charAt(i) == p.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}