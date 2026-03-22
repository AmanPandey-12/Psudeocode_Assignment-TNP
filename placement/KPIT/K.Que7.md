# 💼 KPIT Interview Question 7: Substring Check

## 📝 Description
Check if a string s2 is a substring of s1 (without using contains()).

## 📌 Pseudocode
```
BEGIN
  READ s1, s2
  FOR i = 0 TO LEN(s1)-LEN(s2)
    IF s1[i..i+LEN(s2)] == s2 THEN
      PRINT "Found at index i"
      STOP
  END FOR
END
```

## ☕ Java Solution
```java
public class SubstringCheck {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "world";
        boolean found = false;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                System.out.println("Found at index " + i);
                found = true; break;
            }
        }
        if (!found) System.out.println("Not found");
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Substring Check](https://www.geeksforgeeks.org/check-string-substring-another/)
