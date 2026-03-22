// Question 6: Replace all occurrence of a specific element with another no.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY, oldVal, newVal
//  FOR i = 0 TO LENGTH(arr) - 1
//      IF arr[i] == oldVal THEN
//          arr[i] = newVal
//      END IF
//  END FOR
// END

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 10};
        Scanner aman = new Scanner(System.in);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("Enter element to replace: ");
        int oldVal = aman.nextInt();
        System.out.print("Enter new element: ");
        int newVal = aman.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
            }
        }
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
