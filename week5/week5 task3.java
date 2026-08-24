import java.io.*;
import java.util.*;

public class Solution {

    public static int[] maxSubarray(List<Integer> arr) {

        // Kadane's algorithm for maximum subarray
        int maxSubarray = arr.get(0);
        int currentSum = arr.get(0);

        // Maximum subsequence
        int maxSubsequence = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int value = arr.get(i);

            // Maximum subarray
            currentSum = Math.max(value, currentSum + value);
            maxSubarray = Math.max(maxSubarray, currentSum);

            // Maximum subsequence
            if (value > 0) {
                maxSubsequence += value;
            }
        }

        // If all numbers are negative, choose the largest one
        if (maxSubsequence <= 0) {
            maxSubsequence = Collections.max(arr);
        }

        return new int[]{maxSubarray, maxSubsequence};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            int[] result = maxSubarray(arr);

            System.out.println(result[0] + " " + result[1]);
        }

        sc.close();
    }
}

output

Input (stdin)
2
4
1 2 3 4
6
2 -1 2 3 4 -5
Your Output (stdout)
10 10
10 11
Expected Output
10 10
10 11