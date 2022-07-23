public class Main {
    public static void main(String[] args) {
        //  Java has 8 primitive types that are natively understood by the machine
        //  In the computer memory everything is a series of bits. Type is a way to
        //  make sense of these bits

        //  The primitive types are all numeric types (in one way or the other)
        //  Of which, 4 are regular integral types (whole numbers)
        //  2 are special integral types
        //  2 are decimal number types

        //  regular integral types
        byte byteVar = 10;          //  1 byte (8 bits) width
        short shortVar = 45;        //  2 byte (16 bits) width
        int intVar = 58;            //  4 byte (32 bits) width
        long longVar = 987;         //  8 byte (64 bits) width

        //  special integral types (internally integers, but have special rules)
        boolean booleanVar = true;  //  1 byte (8 bits) width

        //  Though boolean effectively is one bit (on=1/off=0), the CPU cannot
        //  address a single bit. Hence, the width is 1 byte (minimum for the CPU).
        //  boolean variable's values are restricted to only two literals true and false.
        //  In Java, unlike in C++ and JavaScript for example,
        //  there is no automatic conversion of number to boolean.
        //  Even with explicit casts do not work.

        char charVar = 'g';         //  any UTF-16 code point

        //  It is possible to assign an int to char variable, so long as
        //  the value is within the range of 16 bits (unsigned short)
        charVar = 65535;            //  max value assignable

        //  Please note, Java doesn't support unsigned primitives like C++ or C#
        //  So, remember, the left-most bit is always preserved for sign
        //  Accordingly, the range has to be derived
        //  More information: https://cs.fit.edu/~ryan/java/language/java-data.html
        //  For 2's complement for negative numbers: https://www.youtube.com/watch?v=lKTsv6iVxV4

        //  For decimal numbers, we have 2 floating point numbers (conforming to IEEE 754)

        //  Single-precision floating-point number (4 byte or 32 bits width)
        float temperature = 26.8F;  //  F (or f) is the mandatory float suffix

        //  Double-precision floating-point number (8 byte or 64 bits width)
        double speed = 69.78;       //  any literal decimal is a double by default

        //  More information about floating-point numbers: https://www.youtube.com/watch?v=RuKkePyo9zk
    }
}