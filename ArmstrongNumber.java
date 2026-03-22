// Question 16: Armstrong Number 
//
// Pseudocode:
// BEGIN 
// DECLARE n, original, digit, sum AS INTEGER 
// SET sum = 0 
// READ n 
// original = n
// WHILE n > 0 
// digit = n MOD 10 
// sum = sum + digit * digit * digit 
// n = n / 10 
// END WHILE
// IF sum = original THEN 
// PRINT "Armstrong" 
// ELSE PRINT "Not Armstrong" 
// ENDIF 
// END

import java.util.Scanner;

public class ArmstrongNumber { 
    public static void main(String[] args) { 
        Scanner aman = new Scanner(System.in);
        int n, original, digit, sum = 0;
        System.out.print("Enter number: ");
        n = aman.nextInt();
        original = n;
        while (n > 0) {
            digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
