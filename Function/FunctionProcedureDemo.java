// Question 31: Function vs Procedure
//
// Pseudocode:
// PROCEDURE test()
//     PRINT "Hello"
// END PROCEDURE
//
// FUNCTION test()
//     RETURN 0
// END FUNCTION

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
