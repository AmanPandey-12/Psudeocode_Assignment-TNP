# 💼 KPIT Interview Question 6: Armstrong Number

## 📝 Description
A number is Armstrong if sum of cubes of its digits equals itself.
e.g. 153 = 1³ + 5³ + 3³ = 153.

## 📌 Pseudocode
```
BEGIN
  READ n
  SET temp = n, sum = 0
  WHILE temp > 0
    rem = temp MOD 10
    sum = sum + rem^3
    temp = temp / 10
  END WHILE
  IF sum == n THEN PRINT "Armstrong" ELSE PRINT "Not Armstrong"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = aman.nextInt(), t = n, sum = 0;
        while (t > 0) { int r = t % 10; sum += r * r * r; t /= 10; }
        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Armstrong Number](https://www.geeksforgeeks.org/java-program-to-check-armstrong-number/)
