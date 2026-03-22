# 💼 HCL Interview Question 7: Remove Vowels from String

## 📝 Description
Remove all vowels (a, e, i, o, u) from a given string.

## 📌 Pseudocode
```
BEGIN
  READ str
  SET result = ""
  FOR EACH ch IN str
    IF ch NOT IN {a,e,i,o,u} THEN result = result + ch
  END FOR
  PRINT result
END
```

## ☕ Java Solution
```java
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner aman = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = aman.next();
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("After removing vowels: " + result);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Remove Vowels](https://www.geeksforgeeks.org/program-remove-vowels-string/)
