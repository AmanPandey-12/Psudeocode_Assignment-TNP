# 💼 HCL Interview Question 4: Check if Array is Sorted

## 📝 Description
Check whether a given array is sorted in ascending order.

## 📌 Pseudocode
```
BEGIN
  READ arr
  FOR i = 0 TO N-2
    IF arr[i] > arr[i+1] THEN
      PRINT "Not Sorted"
      STOP
  END FOR
  PRINT "Sorted"
END
```

## ☕ Java Solution
```java
public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i+1]) { sorted = false; break; }
        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Check Sorted Array](https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/)
