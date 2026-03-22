# 💼 KPIT Interview Question 2: Check if Number is Power of 2 (Bitwise)

## 📝 Description
Check if a number is a power of 2 using bit manipulation.
Key insight: Power of 2 has exactly one set bit → n & (n-1) == 0.

## 📌 Pseudocode
```
BEGIN
  READ n
  IF n > 0 AND (n AND (n-1)) == 0 THEN
    PRINT "Power of 2"
  ELSE
    PRINT "Not Power of 2"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = aman.nextInt();
        boolean result = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(result ? "Power of 2" : "Not Power of 2");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Power of 2](https://www.geeksforgeeks.org/program-to-find-whether-a-given-number-is-power-of-2/)
