# 💼 HCL Interview Question 1: Bubble Sort

## 📝 Description
Sort an array in ascending order using Bubble Sort algorithm.
One of the most asked sorting questions in HCL.

## 📌 Pseudocode
```
BEGIN
  READ arr
  FOR i = 0 TO N-1
    FOR j = 0 TO N-i-2
      IF arr[j] > arr[j+1] THEN
        SWAP arr[j] and arr[j+1]
    END FOR
  END FOR
  PRINT arr
END
```

## ☕ Java Solution
```java
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int t = arr[j]; arr[j] = arr[j+1]; arr[j+1] = t;
                }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Bubble Sort](https://www.geeksforgeeks.org/bubble-sort/)
