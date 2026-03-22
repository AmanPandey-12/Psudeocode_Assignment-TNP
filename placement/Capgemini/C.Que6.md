# 💼 Capgemini Interview Question 6: Remove Duplicates from Array

## 📝 Description
Remove duplicate elements from an array while maintaining insertion order.

## 📌 Pseudocode
```
BEGIN
  READ arr
  CREATE empty HashSet seen
  FOR EACH x IN arr
    IF x NOT IN seen THEN
      ADD x to result
      ADD x to seen
  END FOR
  PRINT result
END
```

## ☕ Java Solution
```java
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();
        for (int x : arr) seen.add(x);
        System.out.println("Without duplicates: " + seen);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Remove Duplicates](https://www.geeksforgeeks.org/remove-duplicates-sorted-array/)
