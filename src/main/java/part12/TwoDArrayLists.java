package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrayLists {
    // Declares the public class named TwoDArrayLists
    public static void main(String[] args) {
        // Main method where program execution begins
        ArrayList<String> bakeryList = new ArrayList<String>();
        // Creates an ArrayList of Strings named 'bakeryList'
        bakeryList.add("pasta");
        // Adds "pasta" to the bakery list
        bakeryList.add("garlic bread");
        // Adds "garlic bread" to the bakery list
        bakeryList.add("donuts");
        // Adds "donuts" to the bakery list

        ArrayList<String> produceList = new ArrayList<String>();
        // Creates an ArrayList of Strings named 'produceList'
        produceList.add("tomatoes");
        // Adds "tomatoes" to the produce list
        produceList.add("zucchini");
        // Adds "zucchini" to the produce list
        produceList.add("peppers");
        // Adds "peppers" to the produce list

        ArrayList<String> drinksList = new ArrayList<String>();
        // Creates an ArrayList of Strings named 'drinksList'
        drinksList.add("soda");
        // Adds "soda" to the drinks list
        drinksList.add("coffee");
        // Adds "coffee" to the drinks list

        System.out.println(bakeryList);
        // Prints the entire bakeryList ArrayList
        System.out.println(bakeryList.get(0));
        // Prints the element at index 0 of bakeryList ("pasta")
        System.out.println(drinksList);
        // Prints the entire drinksList ArrayList

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // Creates a 2D ArrayList (an ArrayList of ArrayLists) named 'groceryList'
        groceryList.add(bakeryList);
        // Adds the bakeryList as the first row in groceryList
        groceryList.add(produceList);
        // Adds the produceList as the second row in groceryList
        groceryList.add(drinksList);
        // Adds the drinksList as the third row in groceryList
        System.out.println(groceryList);
        // Prints the entire 2D groceryList containing all three lists

        System.out.println(groceryList.get(0));
        // Prints the entire first list in groceryList (bakeryList)
        System.out.println(groceryList.get(0).get(0));
        // Prints the first element of the first list ("pasta")
        System.out.println(groceryList.get(2).get(1));
        // Prints the second element of the third list ("coffee")
    }
}