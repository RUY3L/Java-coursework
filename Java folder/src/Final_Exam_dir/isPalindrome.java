package Final_Exam_dir;

import java.util.Stack;
public class isPalindrome {
    public static boolean IsPalindrome(String input) {
        Stack<Character> my_Char_Stack = new Stack<>();
        char[] ChArr = input.toCharArray(); // char array to operate on
        int range = Math.round(ChArr.length / 2);  // IT ROUNDS DOWN to nearest
        for (int i = 0; i < range; i++) {
//            System.out.print(ChArr[i]);  // used to check char list forming
            my_Char_Stack.push(ChArr[i]);         // char list forming as a stack, 'rac' for racecar
        }
//        System.out.print(my_Char_Stack);
        if (ChArr.length%2==0){range -= 1;}   // if string len even then checkRange is starting one num before at 6/2= 3 -1 = (2:range)
        for (int j = 1; j <=range; j++){    // starts 1 after the checkRange at 2+1=(3:idx) for even num and odd number(It doesn't check middle val)
            System.out.println("check "+(j+range)+": "+ChArr[j+range]);
            if(ChArr[j+range] != my_Char_Stack.pop()){       // checks starting idx for next half and if its equal to tempstack.pop()
//                System.out.println(ChArr[j+range]);          // for racecar tempstack = rac and it checks race(car) against rac = (car) when popped if they match true.
                return false;
            }
        }
        return true;
    }
}
