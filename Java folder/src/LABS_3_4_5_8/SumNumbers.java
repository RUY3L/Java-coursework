package LABS_3_4_5_8;

import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Low?");
//        int low = scan.nextInt();
//        System.out.println("High?");
//        int high = scan.nextInt();
        System.out.println("String? :");
        String write= scan.nextLine();
        System.out.println("repeat? :");
        int repeat = scan.nextInt();

        //sumnumbers(low, high);
        repl(write, repeat);
    }
    public static void sumnumbers(int low, int high){
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
    public static void repl(String write, int repeat){
        for (int i = 0; i<repeat; i++){
            System.out.print(write);

        }
    }
}