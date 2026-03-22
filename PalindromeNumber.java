// Question 17: Check Palindrome Number
//
// Pseudocode:
// BEGIN
//  DECLARE n, original, digit, reverse AS INTEGER
//  SET reverse = 0
//  READ n
//  original = n
//  WHILE n > 0
//  digit = n MOD 10
//  reverse = reverse * 10 + digit
//  n = n / 10
//  END WHILE
//  IF original = reverse THEN
//  PRINT "Palindrome"
//  ELSE
//  PRINT "Not Palindrome"
//  ENDIF
// END

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int n, original, digit, reverse = 0;
        System.out.print("Enter number: ");
        n = aman.nextInt();
        original = n;
        while (n > 0) {
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
