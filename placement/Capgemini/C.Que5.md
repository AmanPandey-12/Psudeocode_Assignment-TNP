# 💼 Capgemini Interview Question 5: Perfect Number

## 📝 Description
A perfect number equals the sum of its proper divisors.
e.g. 28 = 1 + 2 + 4 + 7 + 14 → Perfect Number.

## 📌 Pseudocode
```
BEGIN
  READ n
  SET sum = 0
  FOR i = 1 TO n-1
    IF n MOD i == 0 THEN sum = sum + i
  END FOR
  IF sum == n THEN PRINT "Perfect" ELSE PRINT "Not Perfect"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = aman.nextInt(), sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        System.out.println(sum == n ? "Perfect Number" : "Not a Perfect Number");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Perfect Number](https://www.geeksforgeeks.org/java-program-to-check-whether-a-number-is-perfect-number-or-not/)
