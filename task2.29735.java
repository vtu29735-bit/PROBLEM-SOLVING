public class Main {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {12, 45, 78, 23, 56, 89};
        
        // Define the index you want to access
        int targetIndex = 2; // This will target the number 78

        // Check if the index is within the valid range
        if (targetIndex >= 0 && targetIndex < numbers.length) {
            System.out.println("Element at index " + targetIndex + ": " + numbers[targetIndex]);
        } else {
            System.out.println("Error: Index " + targetIndex + " is out of bounds for this array.");
        }
    }
}
output:
Element at index 2: 78

=== Code Execution Successful ===
