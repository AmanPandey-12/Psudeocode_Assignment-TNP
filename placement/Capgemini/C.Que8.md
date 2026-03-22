# 💼 Capgemini Interview Question 8: Sum of Array Elements

## 📝 Description
Calculate the sum of all elements present in a given array.

## 📌 Pseudocode
```
BEGIN
  READ arr
  SET sum = 0
  FOR EACH x IN arr
    sum = sum + x
  END FOR
  PRINT sum
END
```

## ☕ Java Solution
```java
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Sum: " + sum);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Sum of Array](https://www.geeksforgeeks.org/java-program-to-find-sum-of-array-elements/)
