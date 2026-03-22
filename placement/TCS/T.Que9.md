# 💼 TCS Interview Question 9: Sum of Digits

## 📝 Description
Find the sum of all individual digits of a number.
e.g. 1234 → 1+2+3+4 = 10

## 📌 Pseudocode
```
BEGIN
  READ n
  SET sum = 0
  WHILE n > 0
    sum = sum + (n MOD 10)
    n = n / 10
  END WHILE
  PRINT sum
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = aman.nextInt(), sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        System.out.println("Sum of digits: " + sum);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Sum of Digits](https://www.geeksforgeeks.org/program-for-sum-of-digits/)
