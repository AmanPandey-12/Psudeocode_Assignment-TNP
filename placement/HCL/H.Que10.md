# 💼 HCL Interview Question 10: Two Sum Problem

## 📝 Description
Given an array and a target sum, find two numbers that add up to the target.
Classic interview question at HCL and most top companies.

## 📌 Pseudocode
```
BEGIN
  READ arr, target
  FOR i = 0 TO N-1
    FOR j = i+1 TO N-1
      IF arr[i] + arr[j] == target THEN
        PRINT arr[i], arr[j]
        STOP
    END FOR
  END FOR
END
```

## ☕ Java Solution
```java
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        boolean found = false;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + " + " + arr[j]);
                    found = true; break;
                }
        if (!found) System.out.println("No pair found");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Two Sum](https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/)
