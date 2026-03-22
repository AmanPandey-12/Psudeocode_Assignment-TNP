// Question 3: Find the max/min element in an array.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY
//  DECLARE max = arr[0]
//  DECLARE min = arr[0]
//  FOR i = 1 TO LENGTH(arr) - 1
//      IF arr[i] > max THEN max = arr[i]
//      IF arr[i] < min THEN min = arr[i]
//  END FOR
//  PRINT max, min
// END

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {15, 2, 8, 30, 4, 1, 100};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
