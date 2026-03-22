// Question 19: Count Number of Digits in a Number
//
// Pseudocode:
// BEGIN
//  DECLARE n, count AS INTEGER
//  SET count = 0
//  READ n
//  WHILE n > 0
//  n = n / 10
//  count = count + 1
//  END WHILE
//  PRINT count
// END

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int n, count = 0;
        System.out.print("Enter a number: ");
        n = aman.nextInt();
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits = " + count);
    }
}
