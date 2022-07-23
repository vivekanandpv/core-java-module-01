public class Main {
    public static void main(String[] args) {
        //  integer widening conversions (lower width into higher width)
        //  are allowed by default
        byte byteVar = 15;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;

        //  Please note that the overflow of byte and short is not allowed
        //  byteVar = 128;              //  error
        //  shortVar = 32768;           //  error

        //  Any literal integer is an int (4 byte) value in Java
        longVar = 1245;                 //  int value 1245 is widened in a long

        //  Thus an integer literal cannot cross the boundary
        //  intVar = 2_147_483_648;     //  2_147_483_648 doesn't fit in int
        //  longVar = 2_147_483_648;    //  2_147_483_648 is not a long but an int!

        //  An integer literal can be suffixed with L or l to make it a long literal
        longVar = 2_147_483_648L;       //  now 2_147_483_648 is a long literal

        //  Narrowing conversions (higher width into lower width) are not automatically allowed
        //  as they can result into data loss
        //  An explicit cast in the form of (type) value is required
        //  Beware the risk involved (you are overruling the compiler)!

        //  intVar = 2_147_483_648L;    //  error
        //  byteVar = 128;              //  error

        //  Explicit cast is required (risky in some cases)
        byteVar = (byte) 128;
        intVar = (int) 2_147_483_648L;

        //  When the value is too much to fit into the target type (e.g., int in a byte),
        //  overflow (wrap-around) will occur
        //  More information: https://en.wikipedia.org/wiki/Integer_overflow
        //  https://www.youtube.com/watch?v=WN8i5cwjkSE

        //  Curiously, int to float is allowed
        float floatVar = intVar;

        //  But the other way round is not possible without a cast
        //  intVar = floatVar;          //  not allowed!

        intVar = (int) floatVar;        //  ok with cast (risky?)

        //  float (or double) to int (with cast, of course) results in to truncation of decimal portion
        //  You should not expect round-off!

        floatVar = 5.89F;
        intVar = (int) floatVar;        //  intVar is now 5 because of truncation of .89

        //  float to double is a widening conversion
        double doubleVar = floatVar;

        //  double to float requires a cast
        floatVar = (float) doubleVar;   //  risky!

        //  beware the precision and scale (aka range) issue of floats and doubles
        //  More information: https://www.youtube.com/watch?v=A2HflP5sa_0

        //  L suffix makes any integer (regardless of value) a long value
        //  intVar = 124L;              //  error! 124 is no more an int literal, but a long literal
        intVar = (int) 124L;            //  A cast is required now
    }
}