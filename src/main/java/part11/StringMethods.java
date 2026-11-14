package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class StringMethods {
    // Declares the public class named StringMethods
    public static void main(String[] args) {
        // Main method entry point for the Java application
        String name = "Bro";
        // Declares a String variable 'name' and assigns it "Bro"
        boolean equalsResult = name.equals("Bro");
        // Checks if 'name' is exactly equal to "Bro" (case-sensitive) and stores true
        System.out.println(equalsResult);
        // Prints the result of equals (true) to the console

        boolean lowerResult = name.equals("bro");
        // Checks if 'name' is equal to "bro" case-sensitively and stores false
        System.out.println(lowerResult);
        // Prints the result of equals (false) to the console

        boolean ignoreResult = name.equalsIgnoreCase("bro");
        // Checks if 'name' equals "bro" ignoring case differences and stores true
        System.out.println(ignoreResult);
        // Prints the result of equalsIgnoreCase (true) to the console

        int lengthResult = name.length();
        // Gets the number of characters in 'name' (3) and stores it
        System.out.println(lengthResult);
        // Prints the length (3) to the console

        char charResult = name.charAt(0);
        // Retrieves the character at index 0 ('B') and stores it
        System.out.println(charResult);
        // Prints the character ('B') to the console

        int indexResult = name.indexOf("o");
        // Finds the first index of the substring "o" (2) and stores it
        System.out.println(indexResult);
        // Prints the index (2) to the console

        boolean emptyResult = name.isEmpty();
        // Checks if 'name' has a length of 0 and stores false
        System.out.println(emptyResult);
        // Prints the result of isEmpty (false) to the console

        String upperResult = name.toUpperCase();
        // Converts all characters in 'name' to uppercase ("BRO") and stores it
        System.out.println(upperResult);
        // Prints the uppercase string ("BRO") to the console

        String lowerCaseResult = name.toLowerCase();
        // Converts all characters in 'name' to lowercase ("bro") and stores it
        System.out.println(lowerCaseResult);
        // Prints the lowercase string ("bro") to the console

        String spaced = "   Bro   ";
        // Declares a String variable 'spaced' with leading and trailing spaces
        String trimResult = spaced.trim();
        // Removes leading and trailing whitespace ("Bro") and stores it
        System.out.println("[" + spaced + "]");
        // Prints the original string with brackets to show spaces
        System.out.println("[" + trimResult + "]");
        // Prints the trimmed string with brackets showing spaces are removed

        String replaceResult = name.replace('o', 'a');
        // Replaces all occurrences of character 'o' with 'a' ("Bra") and stores it
        System.out.println(replaceResult);
        // Prints the modified string ("Bra") to the console


    }
}

