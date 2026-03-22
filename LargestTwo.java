// Question 3: Find Largest Among Two Numbers.
//
// Pseudocode:
// BEGIN
//  DECLARE a, b AS INTEGER
//  READ a, b
//  IF a > b THEN
//  PRINT "A is Largest"
//  ELSE
//  PRINT "B is Largest"
//  ENDIF
// END

import java.util.Scanner;

public class LargestTwo {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");
        a = aman.nextInt();
        System.out.print("Enter second number: ");
        b = aman.nextInt();
        if (a > b) {
            System.out.println("A is Largest");
        } else {
            System.out.println("B is Largest");
        }
    }
}
