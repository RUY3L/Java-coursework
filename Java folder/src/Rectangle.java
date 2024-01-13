// A Rectangle stores an (x, y) coordinate of its top/left corner, a width and height.
public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    // constructs a new Rectangle with the given x,y, width, and height
    public Rectangle(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }
    // returns the fields' values
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    // returns a string such as {(5,12), 4x8}
    public String toString(){
        return "{("+this.x+","+this.y+"), "+this.width+"x"+this.height+"}";
    }
}