// Question 8: Count how many elements are even & how many are odd.
//
// Pseudocode:
// BEGIN
//  DECLARE arr AS ARRAY
//  DECLARE evenCount = 0, oddCount = 0
//  FOR EACH element IN arr
//      IF element % 2 == 0 THEN
//          evenCount = evenCount + 1
//      ELSE
//          oddCount = oddCount + 1
//      END IF
//  END FOR
//  PRINT evenCount, oddCount
// END

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total Even elements: " + evenCount);
        System.out.println("Total Odd elements: " + oddCount);
    }
}
