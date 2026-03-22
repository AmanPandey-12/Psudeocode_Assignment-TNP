// Question 13: Print Multiplication Table of a Number
//
// Pseudocode:
// BEGIN
//  DECLARE num AS INTEGER
//  READ num
//  FOR i = 1 TO 10
//  PRINT num * i
//  END FOR
// END

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int num;
        System.out.print("Enter number: ");
        num = aman.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
