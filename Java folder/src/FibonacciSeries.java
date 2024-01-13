public class FibonacciSeries {
    public static void printFibonacciSeries(int limit) {
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibonacci Series: " + num1 + ", " + num2);

        while (num2 < limit) {
            int sum = num1 + num2;
            System.out.print(", " + sum);
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        int limit = 100;
        printFibonacciSeries(limit);
    }
}

