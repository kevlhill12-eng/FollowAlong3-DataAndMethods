package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrays { // define the class named TwoDArrays
    public static void main(String[] args) { // main method where execution starts
        // initialize a 2D String array (grid) of cars with 3 rows and 3 columns
        String[][] cars = {
                {"Camaro", "Corvette", "Silverado"}, // first row containing three car models
                {"Mustang", "Ranger", "F-150"}, // second row containing three car models
                {"Ferrari", "Lambo", "Tesla"} // third row containing three car models
        }; // close the 2D array initialization block

        // start an outer loop to iterate through each row of the 2D array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(); // print a blank line before starting each new row
            // start an inner loop to iterate through each column/element in the current row
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " "); // print the car at row i, column j followed by a space
            } // end of the inner column loop
        } // end of the outer row loop

    } // end of main method
} // end of TwoDArrays class
