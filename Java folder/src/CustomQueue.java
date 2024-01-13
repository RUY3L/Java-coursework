import java.util.ArrayList;

public class CustomQueue {
    ArrayList<Integer> queArray = new ArrayList<>();


    public String getFull(){ //This is just to visualize what's happening in the Array. Can be omitted.
        return queArray.toString();
    }

    public void enqueue(int value){
        queArray.add(value);
    }

    public int dequeue() throws Exception{
        if(!queArray.isEmpty()){
            int h = queArray.get(0);
            queArray.remove(0);
            return h;
        }
        else {
            throw new Exception("EmptyQueueException");
        }
    }

    public boolean isEmpty(){
        return queArray.isEmpty();
    }

    public int size() {
        return queArray.size();
    }
}
