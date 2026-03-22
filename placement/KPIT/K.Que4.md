# 💼 KPIT Interview Question 4: Missing Number in Array

## 📝 Description
Given array of N-1 numbers from 1 to N, find the missing number.
Use formula: Expected Sum = N*(N+1)/2, then subtract actual sum.

## 📌 Pseudocode
```
BEGIN
  READ arr, n
  SET expected = n * (n+1) / 2
  SET actual = SUM of all arr elements
  PRINT expected - actual
END
```

## ☕ Java Solution
```java
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int x : arr) actual += x;
        System.out.println("Missing Number: " + (expected - actual));
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Missing Number](https://www.geeksforgeeks.org/find-the-missing-number/)
