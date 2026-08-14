# WEEK3:SORT CHARACTERS BY FREQUENCY

import java.util.\*;



class Solution {

&#x20;   public String frequencySort(String s) {

&#x20;       // Step 1: Count frequencies

&#x20;       Map<Character, Integer> freqMap = new HashMap<>();

&#x20;       for (char c : s.toCharArray()) {

&#x20;           freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

&#x20;       }



&#x20;       // Step 2: Use a max-heap (priority queue) to sort by frequency

&#x20;       PriorityQueue<Map.Entry<Character, Integer>> maxHeap =

&#x20;           new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());



&#x20;       maxHeap.addAll(freqMap.entrySet());



&#x20;       // Step 3: Build the result string

&#x20;       StringBuilder sb = new StringBuilder();

&#x20;       while (!maxHeap.isEmpty()) {

&#x20;           Map.Entry<Character, Integer> entry = maxHeap.poll();

&#x20;           char c = entry.getKey();

&#x20;           int count = entry.getValue();

&#x20;           for (int i = 0; i < count; i++) {

&#x20;               sb.append(c);

&#x20;           }

&#x20;       }



&#x20;       return sb.toString();

&#x20;   }

}

## OUTPUT:

Case 1

Input

s =

"tree"

Output

"eert"

Expected

"eert"



