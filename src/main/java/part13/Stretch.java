package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        rewatch 2:28:40–2:35:20 for parameters, 2:35:25–2:39:30 for return types
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it — and your own methods
// underneath it — is part of the stretch.
/*
100
5
10
100 i thought it would multiply
Hi sam! i forgot the loop
 */
public class Stretch {

    public static void main(String[] args) {
        int x = 5;
        change(x);
        System.out.println(x);
        System.out.println(twice(x));
        System.out.println(twice(twice(x)));
        greet("Sam", 3);

        System.out.println(square(4));
        System.out.println(square(9));


        System.out.println(average(90, 80, 85));
        System.out.println(average(1, 2, 2));

        System.out.println(rating(9));
    }

    static void change(int x) {
        x = 100;
    }

    static int twice(int n) {
        return n * 2;
    }

    static void greet(String who, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Hi " + who + "! ");
        }
        System.out.println();
    }

    static int square(int n) {
        return n * n;
    }

    static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    public static String rating(int num) {
        if (5 == num) {
            return "Amazing";
        } else if (4 == num || num == 3) {
            return "Good";
        } else if (2 == num || num == 1) {
            return "Bad";
        }else {

            return "invalid";
        }

    }

}
