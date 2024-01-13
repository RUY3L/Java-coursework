import java.util.Stack;

public class StackDemo {
    public static String reverseStringUsingStack(String input){
        Stack<Character> stack1 = new Stack<>();
        char[] s = input.toCharArray();
        String output="";
        for (char c : s) {
            stack1.push(c);
        }
        while(!stack1.isEmpty()){
            output += stack1.pop().toString();
        }
        return output;
    }

    public static String printQueueInReverse(CustomQueue queue) throws Exception {
        Stack<Integer> stack2 = new Stack<>();
        String output2="";
        while(!queue.isEmpty()){
            stack2.push(queue.dequeue());
        }
        while(!stack2.isEmpty()){
            output2 +=(stack2.pop().toString());
        }
        String s = reverseStringUsingStack(output2);
        for(int i=0; i<s.length();i++){
            int a=Character.getNumericValue(s.charAt(i));
            queue.enqueue(a);
        }
        return output2;
    }

    public static void main(String[] args) throws Exception {
        //Reverse Stack test
        System.out.println("gninroMlacihtyMdooG: Reversed: "+reverseStringUsingStack("gninroMlacihtyMdooG"));
        //Queue build
        CustomQueue myQue = new CustomQueue();
        for(int i=1;i<6;i++){
            myQue.enqueue(i);
            System.out.println(myQue.getFull());
        }
        //Full queue check
        System.out.println("Size: "+myQue.size());
        System.out.println("Is empty?:"+myQue.isEmpty());
        System.out.println();
        //Reverse Queue
        System.out.println("Print Queue Reversed: "+printQueueInReverse(myQue));
        System.out.println();
        while(!myQue.isEmpty()){
            System.out.println(myQue.getFull());
            System.out.println("Removing: "+myQue.dequeue());
        }
        //Empty Queue check
        System.out.println("Size: "+myQue.size());
        System.out.println("Is empty?:"+myQue.isEmpty());
        //Exception error test
        myQue.dequeue();
    }
}