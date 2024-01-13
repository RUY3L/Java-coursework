package LABS_3_4_5_8;

public class IfOops {
    public static void main(String[] args) {
        int a = 42, b = 42;
        String smaller = minimum(a, b);
        if (smaller=="None") {
            System.out.println("Neither are smaller.");
        } else{
            System.out.println(smaller + " is the smallest!");
        }
    }

    public static String minimum(int a, int b) {  // returns which int is smaller
        if (a < b) {
            return "a";
        } else if (a > b) {
            return "b";
        } else {
            return "None";
        }
    }
}