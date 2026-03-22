// Question 7: Check if an array contains a given no.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY, target, contains = false
//  FOR EACH element IN arr
//      IF element == target THEN
//          contains = true
//          BREAK
//      END IF
//  END FOR
//  IF contains THEN PRINT "Contains" ELSE PRINT "Does not contain"
// END

import java.util.Scanner;

public class CheckContains {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 2};
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int target = aman.nextInt();
        boolean contains = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                contains = true;
                break;
            }
        }
        
        if (contains) {
            System.out.println("The array contains the number " + target);
        } else {
            System.out.println("The array does not contain the number " + target);
        }
    }
}
