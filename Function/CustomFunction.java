// Question 39: Custom Function (MOD Logic)
//
// Pseudocode:
// FUNCTION fun(a, b)
//     SET c = 2
//     a = a MOD c
//     b = b MOD c
//     RETURN a + b
// END FUNCTION

public class CustomFunction {
    static int fun(int a, int b) {
        int c = 2;
        a = a % c;
        b = b % c;
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + fun(5, 4));
    }
}
