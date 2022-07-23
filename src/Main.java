public class Main {
    public static void main(String[] args) {
        //  A function defined in a class is called a method.
        //  A method is a member of a class to perform an action.

        //  Global functions (as in C++ or Python) cannot be defined in Java

        //  Java starts execution of a class with the main method,
        //  which is called the entry point
        //  main method should be declared as: public static void main(String[])

        //  Calling the method. Since the method returns a double value,
        //  it can be used to initialize a variable. Execution is right to left.
        double doubleVar = square(3.7);
    }

    //  This is the method definition
    //  public is the access modifier
    //  static defines the context of execution (more on this later)
    //  square is the name of the method
    //  double is the return value type (use void if nothing to be return)
    //  double n is the method parameter
    //  Method signature comprises the name of the method and the parameter type list
    //  For this method, the signature is given as: square(double)
    //  Please note that the parameter name (n in this case) is not the part of method signature
    //  Also, note that the return type is not the part of method signature
    public static double square(double n) {
        //  n is the parameter, which is like a local variable (local to method)
        //  value of n is initialized at the call-site (line 14)
        //  At any point in execution, there is only one method that is executing
        //  And the local-variables, parameters, and shared variables are visible
        //  When this method is executing, we don't have access to variables declared
        //  in main method

        double sq = n * n;  //  sq is the local variable, initialization is on us here
        return sq;  //  double has to be returned

        //  return has to be the last statement
        //  In void methods, you cannot return any value, but return can be used (superfluous)
        //  In void methods, the control returns to the call site after reaching the end of the block
        //  any statement after return is unreachable which is a compiler error
    }
}