# 💼 KPIT Interview Question 5: Maximum Subarray Sum (Kadane's Algorithm)

## 📝 Description
Find the contiguous subarray with the maximum sum. Classic Dynamic Programming problem.

## 📌 Pseudocode
```
BEGIN
  READ arr
  SET max_so_far = arr[0], curr_max = arr[0]
  FOR i = 1 TO N-1
    curr_max = MAX(arr[i], curr_max + arr[i])
    max_so_far = MAX(max_so_far, curr_max)
  END FOR
  PRINT max_so_far
END
```

## ☕ Java Solution
```java
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        System.out.println("Max Subarray Sum: " + maxSoFar);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Kadane's Algorithm](https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/)
