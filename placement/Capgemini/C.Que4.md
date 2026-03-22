# 💼 Capgemini Interview Question 4: LCM of Two Numbers

## 📝 Description
Find the Least Common Multiple (LCM) using the formula: LCM = (a*b) / GCD(a,b).

## 📌 Pseudocode
```
BEGIN
  READ a, b
  SET gcd = GCD(a, b)
  SET lcm = (a * b) / gcd
  PRINT lcm
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class LCMofTwo {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = aman.nextInt(), b = aman.nextInt();
        System.out.println("LCM: " + (a / gcd(a, b)) * b);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – LCM](https://www.geeksforgeeks.org/java-program-to-find-lcm-of-two-numbers/)
