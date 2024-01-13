package Final_Exam_dir;

import java.util.Stack;

public class MinStack extends Stack{
    Stack<Integer> myStack = new Stack<>();

    void push(int x){
        myStack.push(x);
    }
    int Pop(){
        return myStack.pop();
    }
    void getMin(){
        int min = myStack.pop();
        int checknum=0;
        while(!myStack.isEmpty()) {
            checknum = myStack.pop();
            if (checknum < min) {
                min = checknum;
            }
        }
        System.out.println("Smallest element: " + min);
    }
    // Part 5 of Section 2
    void reverseStack(){
        Stack<Integer> myTempStack=new Stack<>();
        while(!myStack.isEmpty()){
            myTempStack.push(myStack.pop());
        }
//        System.out.println();
//        while(!myTempStack.isEmpty()){
//            System.out.print(myTempStack.pop()+", ");
//        }
        myStack = myTempStack;
    }

}
