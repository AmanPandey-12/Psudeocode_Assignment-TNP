# 💼 TCS Interview Question 3: Reverse a String

## 📝 Description
Reverse the characters of a given string.
Asked frequently in TCS Digital and TCS NQT coding rounds.

## 📌 Pseudocode
```
BEGIN
  READ str
  SET result = ""
  FOR i = LENGTH(str)-1 DOWNTO 0
    result = result + str[i]
  END FOR
  PRINT result
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = aman.next();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) result += str.charAt(i);
        System.out.println("Reversed: " + result);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Reverse a String](https://www.geeksforgeeks.org/reverse-a-string-in-java/)
