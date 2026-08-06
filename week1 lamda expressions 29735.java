import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }


public PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {
            String str = Integer.toString(n);
            return str.equals(new StringBuilder(str).reverse().toString());
        };
    }
}

public class Solution {
output:
Input (stdin)
5
1 4
2 5
3 898
1 3
2 12
Your Output (stdout)
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
Expected Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
