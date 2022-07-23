public class Main {
    public static void main(String[] args) {
        //  Method overloading refers to defining
        //  multiple methods with the same name
        //  Java supports method overloading so long as the
        //  parameter type list is different (by order or by number)
        //  Please note that the return type and name of the
        //  parameters are not parts of the method signature

        //  The decision about which definition to call happens at the compile-time
        //  Hence in computer science texts this is called static polymorphism
        //  a single method has many faces (poly-morph) as different overloads
        product(1.4, 5.2);  //  line 29

        //  Line 17 is an ambiguous call line lines 18, 24, and 30 are all
        //  potential candidates hence call is not allowed
        //  product(14, 14);

        //  line 26; reason is proximity of the type second parameter 25
        //  is proximal to int (line 26) than to double (line 32; requires
        //  widening conversion)
        product(1.5, 25);
    }

    //  signature: product(double, int)
    public static void product(double d, int i) {
        //  logic
    }

    //  signature: product(int, double)
    //  parameter list is different by order
    public static void product(int a, double b) {
        //  logic
    }

    //  signature: product(double, double)
    //  parameter list is different by type
    public static void product(double x, double y) {
        //  logic
    }

    //  signature: product(double, double, int)
    //  parameter list is different by number
    public static void product(double x, double y, int z) {
        //  logic
    }
}