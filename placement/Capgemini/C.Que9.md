# 💼 Capgemini Interview Question 9: Fibonacci Series

## 📝 Description
Print the Fibonacci series up to N terms.
(0, 1, 1, 2, 3, 5, 8, 13, ...)

## 📌 Pseudocode
```
BEGIN
  READ n
  SET a = 0, b = 1
  FOR i = 1 TO n
    PRINT a
    SET temp = a + b
    SET a = b
    SET b = temp
  END FOR
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class FibonacciN {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n = aman.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b; a = b; b = temp;
        }
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Fibonacci](https://www.geeksforgeeks.org/java-program-to-print-fibonacci-sequence/)
