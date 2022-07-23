public class Main {
    public static void main(String[] args) {
        //  Branching (aka decision control or conditionals) is achieved by
        //  if, else, switch statements

        //  if statement checks a condition (should be boolean) to execute its block
        //  There is no "truthiness" of values concept in Java
        if (true) {
            //  this block executes
        }

        //  Optionally, the else statement can be attached to the if statement
        //  However, else cannot exist without if

        if (true) {
            //  execute if condition is true
        } else {
            //  execute if condition is false
        }

        //  Though if and else statements can be written without blocks, but
        //  it is recommended to have blocks anyway, even if they contain single statements

        //  else can further chain with if or else if else statements

        //  In such ladder-like statements, the first match will win
        if (true) {
            //  statement 1
        } else if (true) {
            // statement 2
        }


        if (true) {
            //  statement 1
        } else if (true) {
            //  statement 2
        } else {
            //  statement 3
        }


        //  ladder structure of if-else is rather ugly many times
        //  it also doesn't provide for fall-through (if-else structure is mutually exclusive)
        //  for well-structured branching, a switch statement is the best choice
        //  You "switch" on a variable. But the type has to be one among byte, short, int, long, enum, String
        //  double and floats are not allowed for switch

        String color = "green";
        switch (color) {
            case "green":
                //  statement 1
                //  statement 2
                break;  // optional to stop fall-through; return can also be considered
            case "red":
                //  statement 3
                //  statement 4
                break;
            default:    //  optional, if no match is found
                //  statement 5
                //  statement 6
                break;  //  not required, but can be used (recommended by some)
        }
    }
}