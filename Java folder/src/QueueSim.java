import java.util.ArrayList;

public class QueueSim {
    ArrayList<Integer> myQue = new ArrayList<>();
    public void enqueue(int value){myQue.add(value);
    }
    public int dequeue(){
        if(!myQue.isEmpty()){
            int h = myQue.get(0);
            myQue.remove(0);
            return h;
        }
        return 0;
    }
}
