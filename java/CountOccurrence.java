// Question 5: Count the occurrence of a specific element.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY, target
//  DECLARE count = 0
//  FOR EACH element IN arr
//      IF element == target THEN
//          count = count + 1
//      END IF
//  END FOR
//  PRINT count
// END

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 5, 8, 5, 3};
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter element to count: ");
        int target = aman.nextInt();
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Occurrence of " + target + " is: " + count);
    }
}
