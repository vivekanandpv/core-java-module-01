public class Main {
    public static void main(String[] args) {
        //  long, float, and double have suffixes for literal values

        long longVar = 1458L;       //  L is preferred over l, which may look like 1

        float floatVar = 2.78F;     //  F is preferred over f

        double doubleVar = 3.1415D; //  D or d is generally skipped as a decimal literal is double by default

        //  For programmer's readability, Java allows _ to be used as a digit separator

        int val = 1_100_256;        // same as 1100256

        //  _ should not be surrounded by whitespace
        //  val = 1 _ 100 _ 256;    //  error

        //  _ should not be used in the beginning or end positions
        //  val = _1_100_256_;      //  error

        //  _ can be used in any place (why confuse others?)
        val = 1_1_00_2_5_6;         //  same as 1100256

        //  repetition of _ is allowed
        val = 1__100__25__6;        //  same as 1100256

        //  _ can be used in doubles and floats
        //  Along with above rules, _ should not come adjacent to .
        //  doubleVar = 3_._4;      //  error

        //  _ can be used in either side of the decimal point
        doubleVar = 3_4.4_7__8;     //  same as 34.478
    }
}