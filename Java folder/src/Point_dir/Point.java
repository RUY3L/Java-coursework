package Point_dir;

public class Point {
    int x;
    int y;

//    public Point_dir.Point(int initX, int initY) {
//        x = initX;
//        y = initY;
//    }
    public double distanceFromOrigin() {
        double dist = Math.sqrt(x*x + y*y);
        return dist;
    }
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public double distance(Point other) {
        int dx = other.x - x;
        int dy = other.y - y;
        double dist = Math.sqrt(dx*dx + dy*dy);
        return dist;
    }

    public int quadrant(){
        if (this.x>0 && this.y>0){
            return 1;
        } else if(this.x<0 && this.y>0){
            return 2;
        } else if(this.x<0 && this.y<0) {
            return 3;
        }else if(this.x>0 && this.y<0){
            return 4;
        }else{
            return 0;
        }
    }
    public void flip(){
        int temp;
        temp = this.x;
        this.x = -this.y;
        this.y = -temp;
    }

    public String toString() {
        return "java.awt.Point_dir.Point[x="+this.x+",y="+this.y+"]";
    }

    public int manhattanDistance(Point other){
        int j = Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
        return j;
    }

}