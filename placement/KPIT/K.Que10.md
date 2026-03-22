# 💼 KPIT Interview Question 10: String to Integer (atoi)

## 📝 Description
Convert a numeric string to an integer manually without parseInt().
e.g. "1234" → 1234

## 📌 Pseudocode
```
BEGIN
  READ str
  SET result = 0
  FOR EACH digit ch IN str
    result = result * 10 + (ch - '0')
  END FOR
  PRINT result
END
```

## ☕ Java Solution
```java
public class StringToInt {
    public static void main(String[] args) {
        String str = "12345";
        int result = 0;
        for (char c : str.toCharArray())
            result = result * 10 + (c - '0');
        System.out.println("Integer: " + result);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – atoi Implementation](https://www.geeksforgeeks.org/write-your-own-atoi/)
