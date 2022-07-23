public class Main {
    public static void main(String[] args) {
        //  A variable is declared in the following way
        //  type name = value;
        //  type and name are mandatory, but = value (initialization) is optional (but recommended in most cases)

        //  Declaring the variable introduces the name into the scope
        //  (here in the scope of the main method)

        //  A name (any kind of name such as class, method, variable)
        //  can only be used after it is declared and initialized

        //  Declares variable with name year of type int and initial value of 1999
        int year = 1999;

        //  Now that the year is declared, it can be used after declaration line,
        //  but within the scope of main method

        System.out.println(year);

        //  year is a "local" variable as it is declared in a method
        //  we can change its value using variable = value; syntax
        //  but the new value should be of the same type (int)

        //  This process is called rebinding (variable is getting rebound to a new value)
        year = 2001;

        //  rebinding is possible only after declaration (line 14)

        //  It is possible to just declare a variable without initialization
        double e;

        //  But e cannot be used unless it is initialized
        //  System.out.println(e);  //  error

        //  This is deferred initialization (not recommended in most cases)
        e = 2.71828;    // this looks like rebinding, but it is not (e did not have any binding earlier)

        //  Rebinding can be prevented by qualifying the variables with final keyword
        final double pi = 3.1415926535;

        //  pi = 5.8    //  error

        //  final variables can have deferred initialization (not recommended in most cases)
        final int score;

        score = 89; //  initialization is allowed

        //  but rebinding is not
        //  score = 99; //  error
    }
}