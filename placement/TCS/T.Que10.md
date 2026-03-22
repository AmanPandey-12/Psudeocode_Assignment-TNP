# 💼 TCS Interview Question 10: Power of a Number

## 📝 Description
Calculate base raised to the power exponent (base^exp) without using Math.pow().

## 📌 Pseudocode
```
BEGIN
  READ base, exp
  SET result = 1
  FOR i = 1 TO exp
    result = result * base
  END FOR
  PRINT result
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = aman.nextInt();
        System.out.print("Enter exponent: ");
        int exp = aman.nextInt();
        long result = 1;
        for (int i = 1; i <= exp; i++) result *= base;
        System.out.println(base + "^" + exp + " = " + result);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Power of Number](https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/)
