// Question 4: Search for a given element (Linear Search).
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY, target, found = false
//  FOR i = 0 TO LENGTH(arr) - 1
//      IF arr[i] == target THEN
//          PRINT "Element found at index", i
//          SET found = true
//          BREAK
//      END IF
//  END FOR
//  IF NOT found THEN PRINT "Element not found"
// END

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = aman.nextInt();
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
