public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};
        
        int max = findMaximum(arr);
        
        System.out.println("The maximum element is: " + max);
    }
    
    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        // Assume the first element is the maximum initially
        int max = array[0];
        
        // Traverse the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger element is found
            }
        }
        output:
The maximum element is: 89

=== Code Execution Successful ===
