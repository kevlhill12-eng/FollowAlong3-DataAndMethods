package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class WrapperClasses {
    // Declares the public class named WrapperClasses
    public static void main(String[] args) {
        // Main method entry point for the Java application
        Boolean a = true;
        // Declares a Boolean wrapper object 'a' and assigns it true
        Character b = '@';
        // Declares a Character wrapper object 'b' and assigns it '@'
        Integer c = 123;
        // Declares an Integer wrapper object 'c' and assigns it 123
        Double d = 3.14;
        // Declares a Double wrapper object 'd' and assigns it 3.14

        String e = "Bro";
        // Declares a String variable 'e' and assigns it "Bro"

        if (a == true) {
            // Evaluates if the Boolean object 'a' is true
            System.out.println("This is true");
            // Prints "This is true" to the console
        }

        if (b == '@') {
            // Evaluates if the Character object 'b' is '@'
            System.out.println("This is true");
            // Prints "This is true" to the console

            System.out.println(c + 1);
            // Unboxes Integer 'c', adds 1, and prints the result (124)
            System.out.println(d * 2);
            // Unboxes Double 'd', multiplies by 2, and prints the result (6.28)


        }
    }
}