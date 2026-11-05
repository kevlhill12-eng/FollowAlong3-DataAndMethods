package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        starts at about 2:23:57 — stop at about 2:27:20, when he says "that is everything you need to know to get started with the for-each loop"
// Guide: GUIDE.md in this folder, steps 11–13
//
// Part 12 — the for-each loop
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForEachLoop.
//    Leave the "package part12;" line and the "public class ForEachLoop" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForEachLoop {
    // Declares the public class named ForEachLoop
    public static void main(String[] args) {
        // Main method where program execution begins
        String[] animals = {"cat", "dog", "rat", "bird"};
        // Declares and initializes a String array named 'animals' with four elements
        for (String i : animals ){
            // Starts a for-each loop to iterate through each element 'i' in the 'animals' array
            System.out.println(i);
            // Prints the current animal element to the console
        }
        ArrayList<String> animalList = new ArrayList<String>();
        // Creates a new ArrayList of Strings named 'animalList'
        animalList.add("cat");
        // Adds "cat" to the end of the ArrayList
        animalList.add("dog");
        // Adds "dog" to the end of the ArrayList
        animalList.add("rat");
        // Adds "rat" to the end of the ArrayList
        animalList.add("bird");
        // Adds "bird" to the end of the ArrayList

        for (String i : animalList){
            // Starts a for-each loop to iterate through each element 'i' in the 'animalList'
            System.out.println(i);
            // Prints the current animal element from the list to the console
        }
    }
}