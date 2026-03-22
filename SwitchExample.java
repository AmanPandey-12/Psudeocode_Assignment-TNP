// Question 12: Switch Case Example
//
// Pseudocode:
// BEGIN
//  DECLARE x AS INTEGER
//  READ x
//  SWITCH x
//  CASE 1: PRINT "ONE"
//  CASE 2: PRINT "TWO"
//  CASE 3: PRINT "THREE"
//  DEFAULT: PRINT "WRONG"
//  END SWITCH
// END

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int x;
        System.out.print("Enter a number (1-3): ");
        x = aman.nextInt();
        switch (x) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("WRONG");
        }
    }
}
