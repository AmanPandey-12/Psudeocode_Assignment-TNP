// Question 10: Largest Among Three Numbers
//
// Pseudocode:
// BEGIN
//  DECLARE a, b, c AS INTEGER
//  READ a, b, c
//  IF a > b AND a > c THEN
//  PRINT "A is Largest"
//  ELSE IF b > a AND b > c THEN
//  PRINT "B is Largest"
//  ELSE
//  PRINT "C is Largest"
//  ENDIF
// END

import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = aman.nextInt();
        b = aman.nextInt();
        c = aman.nextInt();
        if (a > b && a > c) {
            System.out.println("A is Largest");
        } else if (b > a && b > c) {
            System.out.println("B is Largest");
        } else {
            System.out.println("C is Largest");
        }
    }
}
