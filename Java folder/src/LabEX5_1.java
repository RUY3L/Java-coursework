public class LabEX5_1 {
    public static void main(String[] args) {
        printFactors(24);
    }
    public static void mystery(int x) {
        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }

    public static void mystery2(int x, int y) {
        int z = 0;
        while (x % y != 0) {
            x = x / y;
            z++;
            System.out.print(x + ", ");
        }

        System.out.println(z);
    }
    public static void mystery3(int x) {
        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
        }
        System.out.println(x + " " + y);
    }
    public static void mystery4(int n) {
        int x = 1;
        int y = 2;
        while (y < n) {
            if (n % y == 0) {
                n = n / y;
                x++;
            } else {
                y++;
            }
        }
        System.out.println(x + " " + n);
    }
    public static void digitsum(int num) {
        int y = 10;
        int r = 0;
        int sum=0;
        while (r!=num){
            r = num % y;
            sum += r/(y/10);
            y = y*10;
        }
        System.out.println("The digitsum of "+num+" is: "+sum);
    }
    public static void printLetters(String word) {
        StringBuilder dWord = new StringBuilder("" + word.charAt(0));
        for (int i=1; i<word.length();i++){
            dWord.append("-").append(word.charAt(i));
        }
        System.out.println("Dashed word: "+dWord);
    }
    public static void printFactors (int num) {
        StringBuilder pFactors = new StringBuilder(""+ 1);
        for (int r=2; r<=num; r++){
            if (num % r == 0){
                pFactors.append(" and ").append(r);
            }
        }
        System.out.println("Factors are : "+pFactors);
    }
}
