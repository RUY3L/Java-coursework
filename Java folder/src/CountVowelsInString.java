import java.util.*;

public class CountVowelsInString {
    public static void CountVowels(String myString) {
        HashMap<Character, Integer> CountV = new HashMap<>();
        myString = myString.toLowerCase();
            for (int i = 0; i < myString.length(); i++) {
                char currentChar = myString.charAt(i);
                if (CountV.containsKey(currentChar)) {
                    CountV.replace(currentChar, CountV.get(currentChar), CountV.get(currentChar) + 1);
                } else {
                    CountV.putIfAbsent(currentChar, 1);
                }
        }
            for(Map.Entry mEntry : CountV.entrySet()) {
                if (mEntry.getKey().equals('a') || mEntry.getKey().equals('e') || mEntry.getKey().equals('i') || mEntry.getKey().equals('o') || mEntry.getKey().equals('u')){
                System.out.print("key: " + mEntry.getKey() + " & Value: ");
                System.out.println(mEntry.getValue());
            }}
        }
        public static void main (String[]args){
            String a = "aaaeeeeiiuuuuuobbsdfg";
            System.out.println("HashMap elements: ");
            CountVowels(a);
        }
    }




