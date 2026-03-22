// Question 2: Check Even or Odd Number.
//
// Pseudocode:
// BEGIN
//  DECLARE num AS INTEGER
//  READ num
//  IF num % 2 == 0 THEN
//  PRINT "Even Number"
//  ELSE
//  PRINT "Odd Number"
//  ENDIF
// END

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = aman.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
