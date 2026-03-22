// Question 18: Fibonacci Series
//
// Pseudocode:
// BEGIN
//  DECLARE n, a, b, c, i AS INTEGER
//  SET a = 0
//  SET b = 1
//  READ n
//  PRINT a
//  PRINT b
//  FOR i = 2 TO n
//  c = a + b
//  PRINT c
//  a = b
//  b = c
//  END FOR
// END

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int n, a = 0, b = 1, c;
        System.out.print("Enter number of terms: ");
        n = aman.nextInt();
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
