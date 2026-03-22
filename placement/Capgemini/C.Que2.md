# 💼 Capgemini Interview Question 2: Count Vowels and Consonants

## 📝 Description
Count the number of vowels (a,e,i,o,u) and consonants in a given string.

## 📌 Pseudocode
```
BEGIN
  READ str
  SET vowels = 0, consonants = 0
  FOR EACH ch IN str (lowercase)
    IF ch IN {a,e,i,o,u} THEN vowels++
    ELSE IF ch IS LETTER THEN consonants++
  END FOR
  PRINT vowels, consonants
END
```

## ☕ Java Solution
```java
public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int v = 0, c = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (Character.isLetter(ch)) c++;
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Vowels & Consonants](https://www.geeksforgeeks.org/program-count-vowels-consonants-string/)
