# 💼 HCL Interview Question 6: Count Frequency of Characters

## 📝 Description
Count how many times each character appears in a given string.

## 📌 Pseudocode
```
BEGIN
  READ str
  CREATE empty HashMap charMap
  FOR EACH ch IN str
    IF ch IN charMap THEN charMap[ch]++
    ELSE charMap[ch] = 1
  END FOR
  PRINT charMap
END
```

## ☕ Java Solution
```java
import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println("Frequency: " + map);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Character Frequency](https://www.geeksforgeeks.org/print-characters-frequencies-order-occurrence/)
