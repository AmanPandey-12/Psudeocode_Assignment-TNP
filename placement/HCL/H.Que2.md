# 💼 HCL Interview Question 2: Binary Search

## 📝 Description
Search for a target in a sorted array using Binary Search (O log n).

## 📌 Pseudocode
```
BEGIN
  READ arr, target
  SET L = 0, R = N-1
  WHILE L <= R
    SET M = (L + R) / 2
    IF arr[M] == target THEN PRINT M and STOP
    ELSE IF arr[M] < target THEN L = M + 1
    ELSE R = M - 1
  END WHILE
  PRINT "Not Found"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = aman.nextInt();
        int l = 0, r = arr.length - 1, result = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) { result = m; break; }
            else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        System.out.println(result == -1 ? "Not Found" : "Found at index " + result);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Binary Search](https://www.geeksforgeeks.org/binary-search/)
