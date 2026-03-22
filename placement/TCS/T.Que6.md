# 💼 TCS Interview Question 6: Second Largest Element in Array

## 📝 Description
Find the second largest element in a given array without sorting (optimal approach).

## 📌 Pseudocode
```
BEGIN
  READ arr
  SET fst = -INF, snd = -INF
  FOR EACH x IN arr
    IF x > fst THEN
      snd = fst
      fst = x
    ELSE IF x > snd AND x != fst THEN
      snd = x
  END FOR
  PRINT snd
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int fst = Integer.MIN_VALUE, snd = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > fst) { snd = fst; fst = x; }
            else if (x > snd && x != fst) snd = x;
        }
        System.out.println("Second Largest: " + snd);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Second Largest](https://www.geeksforgeeks.org/find-second-largest-element-array/)
