// Question 15: Multiply Two Numbers Using Loop
//
// Pseudocode:
// BEGIN
//  DECLARE a, b, result AS INTEGER
//  result = 0
//  READ a, b
//  FOR i = 1 TO b
//  result = result + a
//  END FOR
//  PRINT result
// END

import java.util.Scanner;

public class MultiplyUsingLoop {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int a, b, result = 0;
        System.out.print("Enter two numbers: ");
        a = aman.nextInt();
        b = aman.nextInt();
        for (int i = 1; i <= b; i++) {
            result = result + a;
        }
        System.out.println("Result = " + result);
    }
}
