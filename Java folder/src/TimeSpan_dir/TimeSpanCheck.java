package TimeSpan_dir;

public class TimeSpanCheck {
    public static void main(String[] args){
        TimeSpan myTime = new TimeSpan(3,45);
        System.out.println(myTime);
        TimeSpan myTime1 = new TimeSpan(13,45);
        System.out.println(myTime1);
        TimeSpan myTime2 = new TimeSpan(25,45);
        System.out.println(myTime2);
        TimeSpan myTime3 = new TimeSpan(3,105);
        System.out.println(myTime3);
        TimeSpan myTime4 = new TimeSpan(0,165);
        System.out.println(myTime4);
        Circle myC = new Circle();
        myC.centerpoint = 34.0;
        myC.radius = 8.5;
    }
}
