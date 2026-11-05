package part12;
import java.util.ArrayList;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayLists {
    // Declares the public class named ArrayLists
    public static void main(String[] args){
        // Main method where program execution begins
        ArrayList<String> food = new ArrayList<String>();
        // Creates a new ArrayList of Strings named 'food'
        food.add("pizza");
        // Adds "pizza" to the end of the list
        food.add("hamburger");
        // Adds "hamburger" to the end of the list
        food.add("hotdog");
        // Adds "hotdog" to the end of the list

        for (int i = 0; i < food.size(); i++){
            // Loops through each element in the ArrayList from index 0 to size - 1
            System.out.println(food.get(i));
            // Prints the element at the current index 'i'
        }
        food.set(0, "sushi");
        // Replaces the element at index 0 ("pizza") with "sushi"
        System.out.println(food);
        // Prints the entire ArrayList showing the updated elements

        food.remove(2);
        // Removes the element at index 2 ("hotdog") from the list
        System.out.println(food);
        // Prints the updated ArrayList after removal

        food.clear();
        // Removes all elements from the ArrayList, leaving it empty
        System.out.println(food);
        // Prints the empty ArrayList
    }
}