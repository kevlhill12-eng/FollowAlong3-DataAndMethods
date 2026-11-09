package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        starts at about 2:40:18 — stop at about 2:45:29, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 14, video 1 — overloaded methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedMethods.
//    Leave the "package part14;" line and the "public class OverloadedMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class OverloadedMethods {
    // Declares the main method, which serves as the entry point of the Java application
    public static void main(String[] args) {
        // Calls the overloaded 'add' method with two integer arguments and stores the result in 'x'
        int x = add(1, 2);
        // Prints the value of variable 'x' to the console
        System.out.println(x);
        // Calls the overloaded 'add' method with three integer arguments and stores the result in 'y'
        int y = add(1,2,3);
        // Prints the value of variable 'y' to the console
        System.out.println(y);
        // Calls the overloaded 'add' method with four integer arguments and stores the result in 'z'
        int z = add(1,2,3,4);
        // Prints the value of variable 'z' to the console
        System.out.println(z);
        // Calls the overloaded 'add' method with four double arguments and stores the result in 'd'
        double d = add(1.0, 2.0, 3.0, 4.0);
        // Prints the value of variable 'd' to the console
        System.out.println(d);
    }

    // Defines an overloaded static method 'add' that accepts two integers and returns their sum
    static int add(int a, int b){
        // Prints a message indicating overloaded method #1 was invoked
        System.out.println("This is overloaded method #1");
        // Returns the sum of 'a' and 'b'
        return a + b;
    }

    // Defines an overloaded static method 'add' that accepts three integers and returns their sum
    static int add(int a, int b, int c){
        // Prints a message indicating overloaded method #2 was invoked
        System.out.println("This is overloaded method #2");
        // Returns the sum of 'a', 'b', and 'c'
        return a + b + c;
    }

    // Defines an overloaded static method 'add' that accepts four integers and returns their sum
    static int add(int a, int b, int c, int d){
        // Prints a message indicating overloaded method #2 was invoked
        System.out.println("This is overloaded method #2");
        // Returns the sum of 'a', 'b', 'c', and 'd'
        return a + b + c  + d;
    }

    // Defines an overloaded static method 'add' that accepts two doubles and returns their sum
    static double add(double a, double b) {
        // Prints a message indicating overloaded method #4 was invoked
        System.out.println("This is overloaded method #4");
        // Returns the sum of 'a' and 'b'
        return a + b;
    }

    // Defines an overloaded static method 'add' that accepts three doubles and returns their sum
    static double add(double a, double b, double c) {
        // Prints a message indicating overloaded method #5 was invoked
        System.out.println("This is overloaded method #5");
        // Returns the sum of 'a', 'b', and 'c'
        return a + b + c;
    }

    // Defines an overloaded static method 'add' that accepts four doubles and returns their sum
    static double add(double a, double b, double c, double d) {
        // Prints a message indicating overloaded method #6 was invoked
        System.out.println("This is overloaded method #6");
        // Returns the sum of 'a', 'b', 'c', and 'd'
        return a + b + c + d;
    }
}


