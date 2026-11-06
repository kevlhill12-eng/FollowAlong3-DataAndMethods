package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /*

        yellow
        blue forgot the brackets

        red green blue thought it would change back
        3 thought it would change back
        red thought the color changed back

        '
         */
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "yellow");
        colors.remove(0);
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(0));
        for (String c : colors) {
            System.out.print(c + " ");
        }
        System.out.println();

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;
        for(int s : scores){
            sum = sum + s;

        }
        System.out.println("Total: "+ sum);

        ArrayList<String> playlist = new ArrayList<String>();

        playlist.add("1:\tSong A");
        playlist.add("2:\tSong B");
        playlist.add("3:\tSong C");
        playlist.add("4:\tSong D");
        int i = 0;

        for (String p : playlist){
            System.out.println(playlist.get(i));
            i++;
        }
            playlist.remove(1);
        System.out.println("Songs left: "+ playlist.size());
        System.out.println(playlist);

        ArrayList<String> row1 = new ArrayList<String>();
        row1.add("Ana");
        row1.add("Ben");
        ArrayList<String> row2 = new ArrayList<String>();
        row2.add("Cam");
        row2.add("Dee");
        row2.add("Eli");

        ArrayList<ArrayList<String>> seats = new ArrayList<ArrayList<String>>();
        seats.add(row1);
        seats.add(row2);

        System.out.println("Row: "+ seats.get(0).get(0) +" " + seats.get(0).get(1) );
        System.out.println("Row: "+ seats.get(1).get(0) +" " + seats.get(1).get(1) + " " + seats.get(1).get(2));
        System.out.println("Back corner: "+ seats.get(1).get(2));
    }



}
