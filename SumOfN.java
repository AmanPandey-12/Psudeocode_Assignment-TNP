// Question 8: Sum of First N Natural Numbers
//
// Pseudocode:
// BEGIN
//  DECLARE n, sum AS INTEGER
//  sum = 0
//  READ n
//  FOR i = 1 TO n
//  sum = sum + i
//  END FOR
//  PRINT sum
// END

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter value of n: ");
        n = aman.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}
