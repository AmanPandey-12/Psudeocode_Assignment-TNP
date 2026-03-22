# 💼 KPIT Interview Question 1: Swap Two Numbers Without Temp Variable

## 📝 Description
Swap two numbers without using a temporary variable using arithmetic.

## 📌 Pseudocode
```
BEGIN
  READ a, b
  a = a + b
  b = a - b
  a = a - b
  PRINT a, b
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = aman.nextInt(), b = aman.nextInt();
        a = a + b; b = a - b; a = a - b;
        System.out.println("After swap: a=" + a + " b=" + b);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Swap Without Temp](https://www.geeksforgeeks.org/swap-two-variables-in-java/)
