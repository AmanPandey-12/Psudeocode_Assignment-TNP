# 💼 TCS Interview Question 5: Leap Year

## 📝 Description
Check if a given year is a leap year.
Rule: Divisible by 400 OR (divisible by 4 AND NOT by 100).

## 📌 Pseudocode
```
BEGIN
  READ year
  IF year MOD 400 == 0 THEN
    PRINT "Leap Year"
  ELSE IF year MOD 4 == 0 AND year MOD 100 != 0 THEN
    PRINT "Leap Year"
  ELSE
    PRINT "Not Leap Year"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = aman.nextInt();
        boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        System.out.println(leap ? "Leap Year" : "Not Leap Year");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Leap Year](https://www.geeksforgeeks.org/java-program-to-check-leap-year/)
