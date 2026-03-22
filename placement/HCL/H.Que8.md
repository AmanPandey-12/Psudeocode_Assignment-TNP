# 💼 HCL Interview Question 8: Selection Sort

## 📝 Description
Sort an array using Selection Sort — repeatedly find the minimum and place it at the front.

## 📌 Pseudocode
```
BEGIN
  READ arr
  FOR i = 0 TO N-2
    SET minIdx = i
    FOR j = i+1 TO N-1
      IF arr[j] < arr[minIdx] THEN minIdx = j
    END FOR
    SWAP arr[i] and arr[minIdx]
  END FOR
  PRINT arr
END
```

## ☕ Java Solution
```java
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) if (arr[j] < arr[min]) min = j;
            int t = arr[min]; arr[min] = arr[i]; arr[i] = t;
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Selection Sort](https://www.geeksforgeeks.org/selection-sort/)
