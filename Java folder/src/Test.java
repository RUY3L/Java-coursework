import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args){

        ArrayList<Integer> Array1 = new ArrayList<Integer>();
        ArrayList<Integer> Array2 = new ArrayList<Integer>();
        ArrayList<Integer> Array3 = new ArrayList<Integer>();
        int l = 0;
        for (int k=0; k<20; k++){
            Array1.add(k);
            //l = k+5;
            Array2.add(k+10);
        }

        Collections.sort(Array1);
        Collections.sort(Array2);

        for(int i=0; i<Array1.size(); i++) {
            for (int j=0; j<Array2.size(); j++) {
                if (Array1.get(i).equals(Array2.get(j))) {
                    Array3.add(Array2.get(j));
                }
            }
        }
        System.out.println(Array1.size());
        System.out.println(Array2.size());
        System.out.println(Array3.size());
        System.out.println(Array3);
    }
}

