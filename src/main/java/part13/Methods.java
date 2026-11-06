package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Methods {


    public static void main(String[] args) {
        // Declares a String variable named 'name' and initializes it with the value "Bro"
        String name = "Bro";

        // Declares an integer variable named 'age' and initializes it with the value 21
        int age = 21;

        // Declares an integer variable named 'x' and initializes it with the value 3
        int x = 3;

        // Declares an integer variable named 'y' and initializes it with the value 4
        int y = 4;

        // Calls the 'hello' method, passing the 'name' and 'age' variables as arguments
        hello(name, age);

        // Calls the 'add' method with 'x' and 'y', and stores the returned sum in a new integer variable 'z'
        int z = add(x, y);

        // Prints the value stored in variable 'z' (7) to the console
        System.out.println(z);

        // Directly prints the integer value returned by calling the 'add' method with 'x' and 'y'
        System.out.println(add(x, y));
    }

    // Defines a static method named 'hello' that takes a String and an int, and returns nothing (void)
    static void hello(String title, int age){
        // Prints "Hello " combined with the value of the 'title' parameter
        System.out.println("Hello "+ title);

        // Prints "You are " combined with the value of the 'age' parameter
        System.out.println("You are "+ age);
    }

    // Defines a static method named 'add' that takes two integers and returns an integer result
    static int add(int x, int y) {
        // Adds the two parameters together and returns the calculated sum to the caller
        return x + y;
    }
}