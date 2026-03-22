// Question 21: Reverse a Number
//
// Pseudocode:
// BEGIN
//  DECLARE n, digit, reverse AS INTEGER
//  SET reverse = 0
//  READ n
//  WHILE n > 0
//  digit = n MOD 10
//  reverse = reverse * 10 + digit
//  n = n / 10
//  END WHILE
//  PRINT reverse
// END

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int n, digit, reverse = 0;
        System.out.print("Enter number: ");
        n = aman.nextInt();
        while (n > 0) {
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse = " + reverse);
    }
}
