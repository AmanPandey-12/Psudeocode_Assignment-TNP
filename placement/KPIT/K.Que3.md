# 💼 KPIT Interview Question 3: Count Set Bits in a Number

## 📝 Description
Count the number of 1s (set bits) in the binary representation of a number.
Classic Bitwise question frequently asked in KPIT interviews.

## 📌 Pseudocode
```
BEGIN
  READ n
  SET count = 0
  WHILE n != 0
    n = n AND (n - 1)
    count = count + 1
  END WHILE
  PRINT count
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = aman.nextInt(), count = 0;
        while (n != 0) { n &= (n - 1); count++; }
        System.out.println("Set Bits: " + count);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Count Set Bits](https://www.geeksforgeeks.org/count-set-bits-in-an-integer/)
