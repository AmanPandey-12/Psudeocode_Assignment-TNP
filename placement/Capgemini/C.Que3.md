# 💼 Capgemini Interview Question 3: GCD of Two Numbers

## 📝 Description
Find the Greatest Common Divisor (GCD) of two numbers using Euclidean Algorithm.

## 📌 Pseudocode
```
BEGIN
  READ a, b
  WHILE b != 0
    temp = b
    b = a MOD b
    a = temp
  END WHILE
  PRINT a  (this is GCD)
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class GCDofTwo {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = aman.nextInt(), b = aman.nextInt();
        while (b != 0) { int t = b; b = a % b; a = t; }
        System.out.println("GCD: " + a);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – GCD](https://www.geeksforgeeks.org/java-program-to-find-gcd-of-two-numbers/)
