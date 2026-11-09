package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9954s
//        starts at about 2:45:54 — stop at about 2:56:50, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 14, video 2 — the printf method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Printf.
//    Leave the "package part14;" line and the "public class Printf" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Printf {
    // Declares the main method, which is the entry point for execution of the Java program
    public static void main(String[] args) {
        // Uses printf to format a string, injecting the integer 123 where %d is placed, followed by a newline
        System.out.printf("This is a format string %d\n", 123);

        // Declares a boolean variable and sets it to true
        boolean myBoolean = true;

        // Declares a character variable and sets it to 'K'
        char myChar = 'K';

        // Declares a String variable and sets it to "Kevin"
        String myString = "Kevin";

        // Declares an integer variable and sets it to 50
        int myInt = 50;

        // Declares a double variable and sets it to 1000
        double myDouble = 1000;

        // Prints the boolean value using the %b format specifier
        System.out.printf("%b\n", myBoolean);

        // Prints the character value using the %c format specifier
        System.out.printf("%c\n", myChar);

        // Prints the String value using the %s format specifier
        System.out.printf("%s\n", myString);

        // Prints the integer value using the %d format specifier
        System.out.printf("%d\n", myInt);

        // Prints the double value using the %f format specifier (default decimal places)
        System.out.printf("%f\n", myDouble);

        // Prints "Hello " followed by the string, right-padded with spaces to take up a minimum width of 10 characters
        System.out.printf("Hello %10s\n", myString);

        // Prints "Hello " followed by the string (left-aligned within a width of 10) and an exclamation mark
        System.out.printf("Hello %-10s!\n", myString);

        // Prints the double value formatted as a standard floating-point number
        System.out.printf("You have this much money %f\n", myDouble);

        // Prints the double value rounded and formatted to 2 decimal places using %.2f
        System.out.printf("You have this much money %.2f\n", myDouble);

        // Prints the double value rounded and formatted to 1 decimal place using %.1f
        System.out.printf("You have this much money %.1f\n", myDouble);

        // Prints the floating-point number left-aligned within a field width of 20 characters
        System.out.printf("You have this much money %-20f\n", myDouble);

        // Prints the floating-point number right-aligned within a field width of 20 characters (default padding with spaces)
        System.out.printf("You have this much money %20f\n", myDouble);

        // Prints the negative floating-point value (-myDouble) with an explicit '+' or '-' sign indicator
        System.out.printf("You have this much money %+f\n", -myDouble);

        // Prints the positive floating-point value (myDouble) forcing an explicit '+' sign prefix
        System.out.printf("You have this much money %+f\n", myDouble);

        // Prints the floating-point value padded with leading zeros to meet a total width of 20 characters
        System.out.printf("You have this much money %020f\n", myDouble);

        // Prints the floating-point value formatted with locale-specific group separators (commas for thousands)
        System.out.printf("You have this much money %,f\n", myDouble);
    }
}