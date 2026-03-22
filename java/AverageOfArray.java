// Question 2: Find the average of array elements.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY
//  DECLARE sum = 0
//  FOR EACH element IN arr
//      sum = sum + element
//  END FOR
//  DECLARE avg = sum / LENGTH(arr)
//  PRINT avg
// END

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("Average of array elements: " + avg);
    }
}
