package Final_Exam_dir;

public class TestFinalExamCode {
    public static void  main(String[] args){
        System.out.println("Question 1 | Find if string is Palindrome: ");
        String b = "racecar"; // you can add text to this to test false
        System.out.println("String: "+b);
        isPalindrome palindrome_object = new isPalindrome();
        System.out.println("Is a palindrome: " + palindrome_object.IsPalindrome(b));

        MinStack myNumstack = new MinStack();
        for (int j = 1; j < 31; j++) {
            myNumstack.push(j);
        }

        System.out.println("Question 2 | Reverse the stack: ");
        System.out.println("Stack: "+myNumstack.myStack);
        myNumstack.reverseStack();
        System.out.println("Reversed stack: "+myNumstack.myStack);
        System.out.println("Question 3 | Find smallest element: ");
        myNumstack.getMin();
        System.out.println("Question 4 | Find if Parentheses is balanced: ");
        String z = "([{}])";
        ParenthesisBalance Parenthesis_Object = new ParenthesisBalance();
        System.out.println("Example 1: "+z);
        System.out.println(Parenthesis_Object.findBalance(z));

        String q = "((({}{}})))";
//        ParenthesisBalance Parenthesis_Object2 = new ParenthesisBalance();
        System.out.println("Example 1: "+q);
        System.out.println(Parenthesis_Object.findBalance(q));
    }
}
