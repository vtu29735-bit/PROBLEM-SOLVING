# week5:Maximum sub array 

class Solution {

&#x20;   public int maxSubArray(int\[] nums) {

&#x20;       int currentSum = nums\[0];

&#x20;       int maxSum = nums\[0];



&#x20;       for (int i = 1; i < nums.length; i++) {

&#x20;           currentSum = Math.max(nums\[i], currentSum + nums\[i]);

&#x20;           maxSum = Math.max(maxSum, currentSum);

&#x20;       }



&#x20;       return maxSum;

&#x20;   }

}

## output:



Case 1

Input

nums =

\[-2,1,-3,4,-1,2,1,-5,4]

Output

6

Expected

6





