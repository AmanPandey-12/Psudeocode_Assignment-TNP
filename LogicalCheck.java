// Question 11: Check a > b AND b > c
//
// Pseudocode:
// BEGIN
//  DECLARE a, b, c AS INTEGER
//  READ a, b, c
//  IF a > b AND b > c THEN
//  PRINT "Condition True"
//  ELSE
//  PRINT "Condition False"
//  ENDIF
// END

import java.util.Scanner;

public class LogicalCheck {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = aman.nextInt();
        b = aman.nextInt();
        c = aman.nextInt();
        if (a > b && b > c) {
            System.out.println("Condition True");
        } else {
            System.out.println("Condition False");
        }
    }
}
