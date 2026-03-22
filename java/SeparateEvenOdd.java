// Question 9: Separate even & odd elements in Array.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY
//  DECLARE evenArr AS ARRAY, oddArr AS ARRAY
//  FOR EACH element IN arr
//      IF element % 2 == 0 THEN
//          Add to evenArr
//      ELSE
//          Add to oddArr
//      END IF
//  END FOR
//  PRINT evenArr, oddArr
// END

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        ArrayList<Integer> evenArr = new ArrayList<>();
        ArrayList<Integer> oddArr = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr.add(arr[i]);
            } else {
                oddArr.add(arr[i]);
            }
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Even Array: " + evenArr);
        System.out.println("Odd Array: " + oddArr);
    }
}
