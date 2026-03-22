// Question 10: Merge / copy elements from one array to another.
//
// Pseudocode:
// BEGIN
//  DECLARE arr1 AS ARRAY, arr2 AS ARRAY
//  DECLARE mergedArr AS ARRAY size of arr1 + arr2
//  FOR i = 0 TO LENGTH(arr1)
//      mergedArr[i] = arr1[i]
//  END FOR
//  FOR j = 0 TO LENGTH(arr2)
//      mergedArr[LENGTH(arr1) + j] = arr2[j]
//  END FOR
//  PRINT mergedArr
// END

import java.util.Arrays;

public class CopyMergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArr = new int[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        
        for (int j = 0; j < arr2.length; j++) {
            mergedArr[arr1.length + j] = arr2[j];
        }
        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merged/Copied Array: " + Arrays.toString(mergedArr));
    }
}
