package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayBasics { // define the class named ArrayBasics
    public static void main(String[] args) { // main method where execution starts
        String car = "Camaro"; // store a single car name in a regular variable
        String[] cars = {"Camaro", "Corvette", "Tesla"}; // create an array holding multiple car names

        cars[0] = "Mustang"; // change the first item in the array to Mustang
        System.out.println(cars[0]); // print the first item in the array

        System.out.println(cars[1]); // print the second item in the array
        System.out.println(cars[2]); // print the third item in the array
        for (int i = 0; i < cars.length; i++) { // loop through the array from start to finish
            System.out.println(cars[i]); // print each car in the array during the loop
        } // end of for loop
    } // end of main method
} // end of class