public class Main {
    public static void main(String[] args) {
        //  Loops let you repeat a set of statements so long as a condition is true

        //  In Java, we have 3 loops (while, do-while, and for)

        //  In a typical while loop, we start with a loop index, check the condition,
        //  execute statements, increment/decrement the index
        int a = 0;  //  loop index

        while (a < 5) { // condition
            System.out.println(a);  //statement/s
            ++a;    // increment
        }

        //  In a do-while loop the condition is checked after the block is executed
        //  thus it guarantees that the loop is executed at least once
        //  used mostly to drive command-line menus

        int b = 2;  // loop index
        do {
            System.out.println();   // statement/s
        } while (b > 5);    //  condition


        //  for loop has all the three factors of loop tucked together

        for (int c = 0; c < 5; ++c) {
            //  statements
        }

        //  Given a certain array or collection, Java also has an "enhanced" for loop
        //  or aka for-each loop. Rather than a loop, this is an implementation of the
        //  iterator design pattern
        //  This loop doesn't have a loop counter or increment/decrement
        int[] intArray = {1, 2, 3, 4, 5};
        for (int e : intArray) {
            //  statements
        }
    }
}