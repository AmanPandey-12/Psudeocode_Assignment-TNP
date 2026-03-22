// Question 36: Largest of Two Numbers
//
// Pseudocode:
// FUNCTION max(a, b)
//     IF a > b THEN
//         RETURN a
//     ELSE
//         RETURN b
// END FUNCTION

public class LargestOfTwo {
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("Max: " + max(10, 20));
    }
}
