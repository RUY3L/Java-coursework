package LABS_3_4_5_8;

import java.util.Scanner;

public class Array_Transpose_Shift {
    public static void main(String[] args) {
        SumNumbers();
    }

    public static void SumNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("low? : ");
        int low = scan.nextInt();
        System.out.print("high? : ");
        int high = scan.nextInt();
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
    public static void CollegeAdmit () {
        Scanner console = new Scanner(System.in);
        System.out.println("University admission program");
        System.out.print("What is your GPA? : ");
        double GPA = console.nextDouble();
        System.out.print("What is your SAT score? : ");
        int SAT = console.nextInt();
        if (GPA<1.8){
            System.out.println("You were declined!");
            return;
        } else if (SAT<900){
            System.out.println("You were declined!");
            return;
        } else {
            System.out.println("You were accepted!");
        }


    }
    public static void processName() {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String firstName = console.next();      // CAREFUL!! only takes first and only string.
        String lastName = console.next();       // To get 2 or more u need more console.next()(not really)
        String fullName= console.nextLine();    // You actually need console.nextLine() for full string.
        char firstInitial = firstName.charAt(0);
        System.out.println("Your name is: "+lastName+", "+firstInitial+". Full name: "+fullName);
    }

    public static void printGrid(int x, int y) {
        //  always  a[columns][row]
        int[][] anArray = new int[x][y]; // x(col) , y(row)
        int[][] transposer = new int[y][x]; // y(col) , x(row)
        int k = 1;
        for (int j = 0; j < y; j++) {          // Rows
            for (int i = 0; i < x; i++) {      // Columns
                anArray[i][j] = k++;         // array[Column][Row] adding column pieces
                // System.out.printf("%2d ", anArray[i][j]);
            }
            // System.out.println();
        }
        for (int j = 0; j < x; j++) { //goes by row =4
            for (int i = 0; i < y; i++) {       // goes by column = 6
                transposer[i][j] = anArray[j][i];
                // transposer jumps column to column in same row, 11, 21, 31, 41, 51, 61
                // anArray jumps row to row in same column. 11 ,12, 13, 14, 15, 16
                System.out.printf("%2d ", transposer[i][j]);
            }
            System.out.println();
        }
    }

    public static void printSquare(int x, int y) {
        int size = (Math.abs(x-y))+1;
        int[] squareArray = new int[size];
        int lowest;
        if (x<y){               // Find the lowest number
            lowest = x;}
        else{
            lowest = y;}

        for (int k = 0; k < size; k++) {        // Create an array with min-max num
            squareArray[k] = lowest++;
            //System.out.print(squareArray[k]); // Check array values
        }
        for (int j = 0; j < size; j++) {        // Per row activity. Print>Shift>Print>...
            System.out.println();
            for (int i = 0; i < size; i++) {    // Print the newly created array
                System.out.printf("%2d ", squareArray[(i)]);
            }
            int temp = squareArray[0];          //Shifting array
            for (int i = 0; i < size-1; i++){
                squareArray[i] = squareArray[i+1];
            }
            squareArray[size-1] = temp;         // End shift
        }
    }

    public static double area(double radius){
        double area= Math.PI * radius*radius;
        return area;
    }
    public static double pay(double salary, int hours){
        int base_hours = hours;
        int overtime=0;
        if (hours>8){
            base_hours = 8;
            overtime = hours-base_hours;
        }
        double payment = (salary * base_hours) + ((1.5*salary) * overtime);
        return payment;
    }
    public static void process(String name) {
        if (name.equals("Whitaker")) {
            System.out.println("You must be really awesome.");
        }
        name = name.replace("a", "e");
        name = name.toUpperCase();
        name = name.substring(0, 3);
        System.out.println(name + " has " + name.length() + " letters");
    }
}