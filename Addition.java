// Question 5: Addition of Two Numbers
//
// Pseudocode:
// BEGIN
//  DECLARE a, b, sum AS INTEGER
//  READ a, b
//  sum = a + b
//  PRINT sum
// END

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter first number: ");
        a = aman.nextInt();
        System.out.print("Enter second number: ");
        b = aman.nextInt();
        sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
