# 📘 FUNCTIONS & PROCEDURES \u2013 COMPLETE README (Q31\u2013Q39)

---

## \ud83d\udd39 INTRODUCTION

This file covers:

* Pseudocode (logic)
* Java implementation
* Easy understanding

---

## \u2705 Q31: Function vs Procedure

### \ud83d\udca1 Concept

* Procedure \u2192 no return
* Function \u2192 returns value

### \ud83d\udd39 Pseudocode

```
PROCEDURE test()
    PRINT "Hello"
END PROCEDURE

FUNCTION test()
    RETURN 0
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
public class FunctionProcedureDemo {
    static void testProcedure() {
        System.out.println("This is a procedure");
    }

    static int testFunction() {
        return 0;
    }

    public static void main(String[] args) {
        testProcedure();
        System.out.println(testFunction());
    }
}
```

---

## \u2705 Q32: Add Two Numbers

### \ud83d\udd39 Pseudocode

```
FUNCTION add(a, b)
    RETURN a + b
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static int add(int a, int b) {
    return a + b;
}
```

---

## \u2705 Q33: Cube of a Number

### \ud83d\udd39 Pseudocode

```
FUNCTION cube(a)
    RETURN a * a * a
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static int cube(int a) {
    return a * a * a;
}
```

---

## \u2705 Q34: Area of Circle

### \ud83d\udd39 Pseudocode

```
FUNCTION areaCircle(r)
    RETURN 3.14 * r * r
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static double areaCircle(double r) {
    return 3.14 * r * r;
}
```

---

## \u2705 Q35: Area of Triangle

### \ud83d\udd39 Pseudocode

```
FUNCTION areaTriangle(a, b)
    RETURN 0.5 * a * b
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static double areaTriangle(int a, int b) {
    return 0.5 * a * b;
}
```

---

## \u2705 Q36: Largest of Two Numbers

### \ud83d\udd39 Pseudocode

```
FUNCTION max(a, b)
    IF a > b THEN
        RETURN a
    ELSE
        RETURN b
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static int max(int a, int b) {
    if (a > b)
        return a;
    else
        return b;
}
```

---

## \u2705 Q37: Absolute Value

### \ud83d\udd39 Pseudocode

```
FUNCTION absolute(a)
    IF a >= 0 THEN
        RETURN a
    ELSE
        RETURN -a
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static int absolute(int a) {
    if (a >= 0)
        return a;
    else
        return -a;
}
```

---

## \u2705 Q38: Factorial

### \ud83d\udd39 Pseudocode

```
FUNCTION factorial(n)
    SET fact = 1
    FOR i = n TO 1 STEP -1
        fact = fact * i
    END FOR
    RETURN fact
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static int factorial(int n) {
    int fact = 1;
    for (int i = n; i >= 1; i--) {
        fact = fact * i;
    }
    return fact;
}
```

---

## \u2705 Q39: Custom Function (MOD Logic)

### \ud83d\udd39 Pseudocode

```
FUNCTION fun(a, b)
    SET c = 2
    a = a MOD c
    b = b MOD c
    RETURN a + b
END FUNCTION
```

### \ud83d\udd39 Java Code

```java
static int fun(int a, int b) {
    int c = 2;
    a = a % c;
    b = b % c;
    return a + b;
}
```

---

## \ud83c\udfaf FINAL SUMMARY

Function = Input \u2192 Process \u2192 Output

\u2714 Function \u2192 returns value
\u2714 Procedure \u2192 no return
\u2714 Used for reuse & clean code

---
