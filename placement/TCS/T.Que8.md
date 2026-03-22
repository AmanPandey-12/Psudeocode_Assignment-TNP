# 💼 TCS Interview Question 8: Binary to Decimal

## 📝 Description
Convert a binary number (in string form) to its decimal equivalent.

## 📌 Pseudocode
```
BEGIN
  READ binStr
  SET dec = 0, pow = 1
  FOR i = LENGTH(binStr)-1 DOWNTO 0
    IF binStr[i] == '1' THEN dec = dec + pow
    pow = pow * 2
  END FOR
  PRINT dec
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String bin = aman.next();
        System.out.println("Decimal: " + Integer.parseInt(bin, 2));
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Binary to Decimal](https://www.geeksforgeeks.org/java-program-to-convert-binary-to-decimal/)
