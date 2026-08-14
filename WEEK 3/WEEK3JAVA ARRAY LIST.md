## WEEK3:JAVA ARRAY LIST

import java.io.\*;

import java.util.\*;



public class Solution {



&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       // Number of lines

&#x20;       int n = sc.nextInt();



&#x20;       ArrayList<ArrayList<Integer>> list = new ArrayList<>();



&#x20;       // Read each line

&#x20;       for (int i = 0; i < n; i++) {



&#x20;           int d = sc.nextInt();



&#x20;           ArrayList<Integer> numbers = new ArrayList<>();



&#x20;           for (int j = 0; j < d; j++) {

&#x20;               numbers.add(sc.nextInt());

&#x20;           }



&#x20;           list.add(numbers);

&#x20;       }



&#x20;       // Number of queries

&#x20;       int q = sc.nextInt();



&#x20;       // Process queries

&#x20;       for (int i = 0; i < q; i++) {



&#x20;           int x = sc.nextInt();

&#x20;           int y = sc.nextInt();



&#x20;           // x and y are 1-based

&#x20;           if (x <= list.size() \&\& y <= list.get(x - 1).size()) {

&#x20;               System.out.println(list.get(x - 1).get(y - 1));

&#x20;           } else {

&#x20;               System.out.println("ERROR!");

&#x20;           }

&#x20;       }



&#x20;       sc.close();

&#x20;   }

}

## OUTPUT:

Input (stdin)

5

5 41 77 74 22 44

1 12

4 37 34 36 52

0

3 20 22 33

5

1 3

3 4

3 1

4 3

5 5

Expected Output

74

52

37

ERROR!

# ERROR!

