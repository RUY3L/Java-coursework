package LABS_3_4_5_8;

public class seeMovie {
    public static void main(String[] args) {
        double cost = 7.68;
        double rating = 4.2;
        System.out.println("cost: " + cost + "| rating: " + rating);
        double interest = interest(cost, rating);
        if (interest < 5) {
            System.out.println("Not interested");
        } else if (interest == 5) {
            System.out.println("Sort-of interested");
        } else {
            System.out.println("Very interested");
        }
    }
    public static double interest(double cost, double rating) {
        int interestMeter = 0;
        if (cost < 5) {
            interestMeter = 10;
        } else if (cost >= 5 && cost < 12) {
            if (rating >= 2 && rating < 5) {
                interestMeter = 5;
            } else if (rating >= 5) {
                interestMeter = 10;
            }
        } else {
            if (rating >=5){
                interestMeter =5;
            }
        }
        return interestMeter;
    }
}
