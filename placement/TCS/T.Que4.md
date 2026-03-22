# 💼 TCS Interview Question 4: Palindrome String

## 📝 Description
Check if a string reads the same forwards and backwards.
e.g. "madam", "racecar" are palindromes.

## 📌 Pseudocode
```
BEGIN
  READ str
  SET rev = REVERSE(str)
  IF str == rev THEN
    PRINT "Palindrome"
  ELSE
    PRINT "Not Palindrome"
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = aman.next();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Palindrome String](https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/)
