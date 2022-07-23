public class Main {
    public static void main(String[] args) {
        //  When the operation involving the variable is used for rebinding
        //  compound assignment operators can be used

        int intVar = 148;
        intVar += 4;              //  same as intVar = intVar + 4;

        //  Please explore: -=, *=, /=, and %=

        //  Special case of compound assignment is to increment with ++ (add 1)
        //  or decrement with -- (subtract 1)
        //  Please note that both these operators return the value
        //  In most circumstances this return value is ignored
        //  This return value is the incremented (or decremented) if "pre" variant is used
        //  This return value is the original (increment or decrement happens after return)
        //  if "post" variant is used

        //  Pre-increment
        //  same as intVar = intVar + 1; preReturn is 153
        int preReturn = ++intVar;

        //  Post-increment
        //  same as intVar = intVar + 1; postReturn is 153 but intVar is 154
        int postReturn = intVar++;

        //  Please explore -- operator in pre and post variants
    }
}