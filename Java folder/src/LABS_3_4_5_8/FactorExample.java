package LABS_3_4_5_8;

public class FactorExample {
    public static void main(String[] args) {
        // write some test calls here
        factoring(4);
        factoring(3.6);
        factoring(3.1);
        factoring(1.4);
        factoring(0.2);
    }
    public static void factoring(double gpa) {
        int credits = 5;
        if (gpa == 4.0) {
            System.out.println("I'm valedictorian for this class! Woo hoo!");
        } else if (gpa >= 3.5) {
            System.out.println("I made the dean's list for this class!");
        }
        else if (gpa < 1.5) {
            System.out.println("Uh-oh..I probably should have studied a little more.");
            credits = 0;
        }
        else{
            System.out.println("I'm passing.");
        }
        System.out.println("I received " + credits + " credits for this class.");
    }
}
