# WEEK3:LARGEST NUMBRER

import java.util.\*;



public class Solution {

&#x20;   public String largestNumber(int\[] nums) {

&#x20;       // Convert numbers to strings

&#x20;       String\[] arr = new String\[nums.length];

&#x20;       for (int i = 0; i < nums.length; i++) {

&#x20;           arr\[i] = String.valueOf(nums\[i]);

&#x20;       }



&#x20;       // Sort using custom comparator

&#x20;       Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));



&#x20;       // Edge case: if the largest number is "0", return "0"

&#x20;       if (arr\[0].equals("0")) {

&#x20;           return "0";

&#x20;       }



&#x20;       // Build the result

&#x20;       StringBuilder sb = new StringBuilder();

&#x20;       for (String s : arr) {

&#x20;           sb.append(s);

&#x20;       }

&#x20;       return sb.toString();

&#x20;   }



&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       int n = sc.nextInt();

&#x20;       int\[] nums = new int\[n];

&#x20;       for (int i = 0; i < n; i++) {

&#x20;           nums\[i] = sc.nextInt();

&#x20;       }

&#x20;       Solution sol = new Solution();

&#x20;       System.out.println(sol.largestNumber(nums));

&#x20;   }

}

## OUTPUT:

Runtime: 1 ms

Case 1

Case 2

Input

nums =

\[10,2]

Output

"210"

Expected

"210"



