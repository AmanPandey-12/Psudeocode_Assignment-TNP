# 💼 TCS Interview Question 2: Check Prime Number

## 📝 Description
Determine if a given number is prime. A prime has exactly 2 divisors: 1 and itself.
Extremely common in TCS NQT and written tests.

## 📌 Pseudocode
```
BEGIN
  READ n
  SET count = 0
  FOR i = 1 TO n
    IF n MOD i == 0 THEN count++
  END FOR
  IF count == 2 THEN
    PRINT "Prime"
  ELSE
    PRINT "Not Prime"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = aman.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        System.out.println(count == 2 ? "Prime" : "Not Prime");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Prime Number](https://www.geeksforgeeks.org/java-program-to-check-whether-a-number-is-prime-or-not/)
