package Final_Exam_dir;

import java.util.Stack;

public class ParenthesisBalance {
    public static String findBalance(String input) {
        Stack<Character> myStack3 = new Stack<>();
        char[] BrArr = input.toCharArray();
        for (char bracket : BrArr) {
            //System.out.print(bracket);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                myStack3.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (myStack3.isEmpty()) {
                    //back bracket without front
                    return "not Balanced";
                }
                char top = myStack3.pop();
                if ((bracket == ')' && top != '(')||(bracket == '}' && top != '{')||(bracket == ']' && top != '[')) {
                    return "not Balanced";
                }
            }
        }
        if(myStack3.isEmpty()){
            return "Balanced";
        }
        return "not Balanced";
    }
}

