// Question 37: Absolute Value
//
// Pseudocode:
// FUNCTION absolute(a)
//     IF a >= 0 THEN
//         RETURN a
//     ELSE
//         RETURN -a
// END FUNCTION

public class AbsoluteValue {
    static int absolute(int a) {
        if (a >= 0)
            return a;
        else
            return -a;
    }

    public static void main(String[] args) {
        System.out.println("Absolute: " + absolute(-15));
    }
}
