public class Main {
    public static void main(String[] args) {
        //  Arrays are the low-level data-structures provided by the language

        //  An array is a fixed, ordered collection of same type of elements

        //  There are two ways of declaring arrays
        //  Java preferred way
        int[] intArray;

        //  Old C way
        int anotherArray[];

        //  Value of an array can be provided in several ways

        intArray = new int[]{124, 457, 444};

        //  If the initialization is done alongside declaration,
        //  the initializer syntax can be used (handy)

        int[] numbers = {9, 8, 7};

        //  If the elements are not known, then the size has to be mentioned
        //  which should be a compile-time constant
        //  In this case all the elements are zero or equivalent (false and null)
        int[] scores = new int[3];

        //  Arrays are subscriptable; to gain access to nth element:
        System.out.println(numbers[2]);     //  prints 7

        //  Arrays have zero-based indexing

        //  To set/change an element
        numbers[0] = 54;                    //  first element (0th index) is changed from 9 to 54

        //  Arrays are static, in the sense that the size cannot be increased or decreased

        //  In Java, the arrays are reference types (objects behind the scene) and have .length field
        System.out.println(numbers.length); //  prints 3

        //  Arrays are used in many complex data structures as backing containers
    }
}