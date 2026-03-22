# 💼 KPIT Interview Question 9: Find Duplicate in Array

## 📝 Description
Find if there is a duplicate element in an array. Use HashSet for O(n) solution.

## 📌 Pseudocode
```
BEGIN
  READ arr
  CREATE empty HashSet seen
  FOR EACH x IN arr
    IF x IN seen THEN
      PRINT "Duplicate: x"
      STOP
    ELSE
      ADD x TO seen
  END FOR
END
```

## ☕ Java Solution
```java
import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        HashSet<Integer> seen = new HashSet<>();
        for (int x : arr) {
            if (!seen.add(x)) {
                System.out.println("Duplicate: " + x);
                break;
            }
        }
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Find Duplicate](https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/)
