# 💼 HCL Interview Question 9: Linear Search

## 📝 Description
Search for a target element in an unsorted array using Linear Search.

## 📌 Pseudocode
```
BEGIN
  READ arr, target
  FOR i = 0 TO N-1
    IF arr[i] == target THEN
      PRINT "Found at index i"
      STOP
  END FOR
  PRINT "Not Found"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class LinearSearchHCL {
    public static void main(String[] args) {
        int[] arr = {10, 3, 7, 2, 5, 8};
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = aman.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { System.out.println("Found at index " + i); found = true; break; }
        }
        if (!found) System.out.println("Not Found");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Linear Search](https://www.geeksforgeeks.org/linear-search/)
