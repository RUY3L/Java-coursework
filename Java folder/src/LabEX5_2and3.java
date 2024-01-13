import java.util.Random;
public class LabEX5_2and3 {
    public static void main(String[] args){
        System.out.println(isVowel("u"));
    }
    public static boolean isVowel(String s) {
        s = s.toLowerCase();
        if (s.equals("a") || s.equals("e") || s.equals("i")
                || s.equals("o") || s.equals("u")) {
            return true;
        } else {
            return false;
        }
    }
    public static void sameDashes(String givenString1, String givenString2){
        boolean match = false;
        String givstring1 = givenString1.replaceAll("[^-]","#");
        String[] string1 = givstring1.split("#");
        String givstring2 = givenString2.replaceAll("[^-]","#");
        String[] string2 = givstring2.split("#");
        if (string1.length != string2.length){
            System.out.println("same dashes? " +match);
        }
        if (givstring1.equals(givstring2)){
            match = true;
            System.out.println("same dashes? " +match);
        }



        System.out.println();
    }
    public static void before(String givenDate1, String givenDate2){
        String[] date1 = givenDate1.split(" ");
        String[] date2 = givenDate2.split(" ");
        int d1 = Integer.parseInt(date1[1]);
        int d2 = Integer.parseInt(date2[1]);
        int m1 = Integer.parseInt(date1[0]);
        int m2 = Integer.parseInt(date2[0]);
        boolean date1before = false;
        if (m1<m2){
            date1before=true;
        } else if (m1 == m2){
            if (d1<d2){
                date1before=true;
            } else if(d1==d2){
                System.out.println("same date");
            }
        }
        System.out.println(date1before);
    }
    public static void makeGuesses(){
        Random randy = new Random();
        int aGuess = 0;
        int guessCount=0;
        while(aGuess!=48){
            aGuess = randy.nextInt(51);
            System.out.println("guess = " +aGuess);
            guessCount++;
        }
        System.out.println("total guesses = "+ guessCount);
    }
    public static void allDigitsOdd(int num){
        int y = 10;
        int r = 0;
        int currentDigit =0;
        boolean set= true;
        while (r!=num){
            r = num % y;
            currentDigit = r/(y/10);
            if (currentDigit % 2 == 0){
                set = false;
                break;
            }
            y = y*10;
        }
        System.out.println(num+" all digits odd? "+set);
    }
    public static void hasMidpoint (int x, int y, int z){
        boolean set=false;
        int midpoint1 = x-((x-y)/2);
        int midpoint2 = y-((y-z)/2);
        int midpoint3 = z-((z-x)/2);
        if (x==midpoint2){
            set=true;
        }
        if (z==midpoint1){
            set=true;
        }
        if (y==midpoint3){
            set=true;
        }
        System.out.println("number set: "+x+" "+y+" "+z);
        System.out.println("midpoints: "+midpoint1+" "+midpoint2+" "+midpoint3);
        System.out.println("has midpoint: "+set);
    }
}
