# 💼 Capgemini Interview Question 7: Replace Spaces with %20

## 📝 Description
Replace all spaces in a string with "%20" (URL encoding).
Classic Capgemini string manipulation question.

## 📌 Pseudocode
```
BEGIN
  READ str
  SET result = ""
  FOR EACH ch IN str
    IF ch == ' ' THEN result = result + "%20"
    ELSE result = result + ch
  END FOR
  PRINT result
END
```

## ☕ Java Solution
```java
public class ReplaceSpaces {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String result = str.replace(" ", "%20");
        System.out.println("Encoded: " + result);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – URLify String](https://www.geeksforgeeks.org/urlify-a-given-string-replace-spaces-with-20/)
