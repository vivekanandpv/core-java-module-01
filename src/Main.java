public class Main {
    public static void main(String[] args) {
        //  Make sure you learn about the precedence of operators
        //  https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        //  Beware the operations involving bytes and shorts
        //  They yield int results and may require casts
        byte a = 4;
        byte b = 8;
        byte c = (byte) (a + b);            //  result is an int hence requires cast

        //  regular integer types (byte, short, int, and long) and floating-point types
        //  (float and double) are "compatible" as far as operations go

        //  When a float is involved in the operation, the result is a float
        int intVar = 1458;
        float floatVar = intVar + 2.5F;

        //  When a double is involved in the operation, the result is a double
        double doubleVar = intVar + 2.5;    //  2.5 is a double literal

        //  When both float and double are involved, the result is a double
        doubleVar = intVar + floatVar - doubleVar;

        //  Integer division truncates decimal portion of the result
        int quotient = intVar / 14;         //  Actual result 104.142857143 gets truncated to 104

        //  Modulo operation can be applied to double and float as well
        doubleVar = doubleVar % 1.45;       //  result is double
        floatVar = floatVar % 1.87F;        //  result is float
    }
}