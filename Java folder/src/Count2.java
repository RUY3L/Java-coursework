public class Count2 {
    public static void main(String[] args) {
        /*for (int j= 5; j>0; j--) {
            for (int i = 9; i >= 0; i--) {
                String str = ""+i;
                System.out.print(str.repeat(i));
            }
            System.out.println();
        }*/
        //stars();
//        mystery();
        Debugger();
    }
    public static void stars() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 20 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void mystery() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    public static void Debugger() {
        int number = 42;
        for (int i = 1; i <= 1000; i++) {
            number = number * 37 % 103;
        }
        int number2 = number * number;
        System.out.println("result = " + number2);
    }
}
