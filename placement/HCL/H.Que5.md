# 💼 HCL Interview Question 5: Fibonacci Recursive

## 📝 Description
Calculate the Nth Fibonacci number using recursion.

## 📌 Pseudocode
```
FUNCTION fib(n)
  IF n <= 1 THEN RETURN n
  RETURN fib(n-1) + fib(n-2)
END FUNCTION

BEGIN
  READ n
  PRINT fib(n)
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class FibonacciRecursive {
    static int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = aman.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Fibonacci Recursive](https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/)
