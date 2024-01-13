import java.util.Scanner;
public class longestName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        longestName(console, 4);
    }
    public static void longestName(Scanner console, int n){
        int pCount = 0;
        String longName = "";
        for (int i=1;i<=n; i++){
            System.out.println("Name #"+i+"? :");
            String str = console.nextLine();
            String names = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
            int nCount = names.length();
            if (nCount>pCount){
                pCount = nCount;
                longName = names;
            }
            System.out.println(names);
        }
        System.out.println("Longest name is: "+longName+ ", with "+pCount+" letters");
    }
}
