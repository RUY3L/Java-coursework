package TimeSpan_dir;

// A TimeSpan_dir.ClockTime object represents an hour:minute time during
// the day or night, such as 10:45 AM or 6:27 PM.
public class ClockTime {
    private int hour;
    private int minute;
    private String amPm;
    boolean am = true;

    // Constructs a new time for the given hour/minute
    public ClockTime(int h, int m, String ampm){
        if (ampm.equals("PM")){
            am = false;
        }
        if (m>=60){
            h += m/60;
            m = m%60;
        }
        if (h>12){
            for(int i=0;i<(h/12); i++){
                am = !am;
            }
            h = h%12;
        }
        if (am){
            amPm = "AM";
        } else {
            amPm = "PM";
        }
        this.minute = m;
        this.hour = h;
    }

    // returns the field values
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public String getAmPm(){
        return this.amPm;
    }

    // returns a String for this time; for example, "6:27 PM"
    public String toString(){
        String printMin = "";
        if (this.minute<10){
            printMin = "0"+this.minute;
        } else{
            printMin += this.minute;
        }

        return this.hour+":"+printMin+" "+this.amPm;
    }

    public void advance(int min){
        int m = this.minute+min;
        int h = this.hour;

        boolean am2 = true;
        am2 = !this.amPm.equals("PM");

        if (m>=60){
            h += m/60;
            m = m%60;
        }
        if (h>12){
            for(int i=0;i<(h/12); i++){
                am2 = !am2;
            }
            h = h%12;
        }
        if (am2){
            amPm = "AM";
        } else {
            amPm = "PM";
        }
        this.minute = m;
        this.hour = h;
    }

    public boolean isWorkTime(){
        if (this.amPm.equals("AM") && this.hour!=12){
            return this.hour >= 9;
        }
        else if (this.amPm.equals("PM") && this.hour!=0) {
            if (this.hour == 12) {
                return true;
            } else return this.hour<5;
        }
        return false;
    }
}
