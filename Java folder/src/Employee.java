public class Employee {
    // public  = class, package, subclass, world
    // protected = class, package, subclass
    // no modifier = class, package
    // private = class
    // if (A instace of Charecter){}
    private int grades;

    public void myG(){

    }

    public String toString(){
        return this.grades+" = grade";
    }

    public static void main(String[] args){
        Employee me = new Employee();
        me.myG();
        System.out.println(me);
    }
}
