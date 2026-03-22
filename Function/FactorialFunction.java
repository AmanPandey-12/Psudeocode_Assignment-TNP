// Question 38: Factorial
//
// Pseudocode:
// FUNCTION factorial(n)
//     SET fact = 1
//     FOR i = n TO 1 STEP -1
//         fact = fact * i
//     END FOR
//     RETURN fact
// END FUNCTION

public class FactorialFunction {
    static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5));
    }
}
