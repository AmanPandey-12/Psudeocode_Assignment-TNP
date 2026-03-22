// Question 4: Grade Calculation Based on Marks
//
// Pseudocode:
// BEGIN
//  DECLARE marks AS INTEGER
//  READ marks
//  IF marks >= 80 THEN
//  PRINT "Grade A"
//  ELSE IF marks >= 60 THEN
//  PRINT "Grade B"
//  ELSE IF marks >= 50 THEN
//  PRINT "Grade C"
//  ELSE IF marks >= 40 THEN
//  PRINT "Grade D"
//  ELSE
//  PRINT "Fail"
//  ENDIF
// END

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        int marks;
        System.out.print("Enter marks: ");
        marks = aman.nextInt();
        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
