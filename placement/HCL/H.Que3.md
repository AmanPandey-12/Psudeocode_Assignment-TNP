# 💼 HCL Interview Question 3: String Length Without Inbuilt Function

## 📝 Description
Find the length of a string without using the `.length()` method.

## 📌 Pseudocode
```
BEGIN
  READ str
  SET count = 0
  FOR EACH character IN str
    count = count + 1
  END FOR
  PRINT count
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class StringLengthManual {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = aman.next();
        int count = 0;
        for (char c : str.toCharArray()) count++;
        System.out.println("Length: " + count);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – String Length Without Inbuilt](https://www.geeksforgeeks.org/find-length-of-a-string-without-using-any-in-built-method-in-java/)
