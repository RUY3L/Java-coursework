import java.util.Random;
public class quadrant {

    public static void main(String[] args){
        double x;
        double y;
        Random rd = new Random();
        for (int i = -2; i < 3; i++){
            x = i;
            y = Math.pow((i-5), (i%2)+2);
            System.out.println(Quadrant(x,y));
        }
    }
    public static int Quadrant(double x, double y){
        if (x>0 && y>0){
            System.out.println("points "+x+" and "+y+" are on quadrant 1");
            return 1;
        }
        if (x<0 && y>0){
            System.out.println("points "+x+" and "+y+" are on quadrant 2");
            return 2;
        }
        if (x<0 && y<0){
            System.out.println("points "+x+" and "+y+" are on quadrant 3");
            return 3;
        }
        if (x>0 && y<0){
            System.out.println("points "+x+" and "+y+" are on quadrant 4");
            return 4;
        }
        else {
            System.out.println("points "+x+" and "+y+" are on no specific quadrant.");
            return 0;
        }
    }
}
