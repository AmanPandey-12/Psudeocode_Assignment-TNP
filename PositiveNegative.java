// Question 1: Check Whether a Number is Positive or Negative
//
// Pseudocode:
// BEGIN
//  DECLARE num AS INTEGER
//  READ num
//  IF num >= 0 THEN
//  PRINT "Positive Number"
//  ELSE
//  PRINT "Negative Number"
//  ENDIF
// END

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = aman.nextInt();
        if (num >= 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}
