// Question 1: Find the sum of all elements in an Array.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY
//  DECLARE sum = 0
//  FOR EACH element IN arr
//      sum = sum + element
//  END FOR
//  PRINT sum
// END

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
