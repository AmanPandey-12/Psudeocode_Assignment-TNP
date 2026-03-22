# 💼 TCS Interview Question 7: Decimal to Binary

## 📝 Description
Convert a decimal number to its binary (base-2) representation.

## 📌 Pseudocode
```
BEGIN
  READ n
  SET ans = ""
  WHILE n > 0
    rem = n MOD 2
    ans = rem + ans
    n = n / 2
  END WHILE
  PRINT ans
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = aman.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(n));
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Decimal to Binary](https://www.geeksforgeeks.org/java-program-to-convert-decimal-to-binary/)
