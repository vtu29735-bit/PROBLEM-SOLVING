import java.util.*;

public class GFG {

    static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();

        int m = pat.length();
        int n = txt.length();

        // Build LPS array
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }

        // KMP search
        i = 0;
        int j = 0;

        while (i < n) {

            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                result.add(i - j);

                // Continue searching for overlapping matches
                j = lps[j - 1];

            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "geeks";

        ArrayList<Integer> result = search(pattern, text);

        System.out.println(result);
    }
}

output

0 9 12 
