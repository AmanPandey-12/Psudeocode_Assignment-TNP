# 💼 TCS Interview Question 1: Factorial of a Number

## 📝 Description
Find the factorial of a given number `n`. (n! = 1 × 2 × 3 × ... × n)
This is one of the most commonly asked questions in TCS NQT and coding rounds.

## 📌 Pseudocode
```
BEGIN
  READ n
  SET f = 1
  FOR i = 1 TO n
    f = f * i
  END FOR
  PRINT f
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = aman.nextInt();
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        System.out.println("Factorial: " + f);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Factorial](https://www.geeksforgeeks.org/java-program-to-find-factorial-of-a-number/)
