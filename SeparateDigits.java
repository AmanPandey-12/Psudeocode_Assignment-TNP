// Question 20: Separate Two Digit Number (Tens & Ones)
//
// Pseudocode:
// BEGIN
//  DECLARE n, a, b AS INTEGER
//  READ n
//  a = n MOD 10
//  b = n / 10
//  PRINT b
//  PRINT a
// END

import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int n, a, b;
        System.out.print("Enter two digit number: ");
        n = aman.nextInt();
        a = n % 10;
        b = n / 10;
        System.out.println("Tens = " + b);
        System.out.println("Ones = " + a);
    }
}
