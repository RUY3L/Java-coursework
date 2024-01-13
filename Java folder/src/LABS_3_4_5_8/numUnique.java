package LABS_3_4_5_8;

public class numUnique {
    public static void main(String[] args){
        numUnique(4, 5, 6);
        numUnique(4, 5, 5);
        numUnique(5, 5, 5);
    }
    public static void numUnique(int x, int y, int z){
        int Unique=0;
        if (x!=y){
            Unique++;
        } if (y!=z) {
            Unique++;
        } if (z != x){
            Unique++;
        }
        if (x==y && y==z) {
            System.out.println("They are all the same");
            return;
        }
        System.out.println("There are " + Unique + " unique numbers");
    }
}
