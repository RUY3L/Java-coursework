package TimeSpan_dir;

public class TimeSpan {
    int min;
    int hour;
    public TimeSpan(int HR, int MN){
        if (MN>=60){
            HR += MN/60;
            MN = MN%60;
        }
        if (HR>=24){
            HR = HR%24;
        }
        this.min = MN;
        this.hour = HR;
    }
    public String toString(){
        return this.hour+" hour, "+this.min+" min";
    }
}
