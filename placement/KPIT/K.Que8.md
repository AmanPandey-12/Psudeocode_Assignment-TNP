# 💼 KPIT Interview Question 8: Reverse an Array

## 📝 Description
Reverse all elements of a given array in-place using two pointers.

## 📌 Pseudocode
```
BEGIN
  READ arr
  SET left = 0, right = N-1
  WHILE left < right
    SWAP arr[left] and arr[right]
    left = left + 1
    right = right - 1
  END WHILE
  PRINT arr
END
```

## ☕ Java Solution
```java
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l = 0, r = arr.length - 1;
        while (l < r) { int t = arr[l]; arr[l] = arr[r]; arr[r] = t; l++; r--; }
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Reverse Array](https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/)
