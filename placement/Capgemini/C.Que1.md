# 💼 Capgemini Interview Question 1: Anagram Strings

## 📝 Description
Two strings are anagrams if they contain the same characters in any order.
e.g. "listen" and "silent" are anagrams.

## 📌 Pseudocode
```
BEGIN
  READ s1, s2
  SORT characters of s1
  SORT characters of s2
  IF sorted s1 == sorted s2 THEN
    PRINT "Anagram"
  ELSE
    PRINT "Not Anagram"
END
```

## ☕ Java Solution
```java
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
        Arrays.sort(c1); Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2) ? "Anagram" : "Not Anagram");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Anagram Check](https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/)
