public class Recursion_lab_9 {

    public static void main(String[] args){
        //System.out.println("Hello world!");
        int n= 10;
        n=Math.abs(n);
        System.out.println("Factorial for "+n+" is: "+factorial(n));
        System.out.println("Fibonacci at "+n+" is: "+fibonacci(n));

        int[] array = new int[51];
        for (int i=0;i<51;i++){
            array[i] = i-25;
            System.out.print(array[i]+", ");
        }
        System.out.println(0);
        System.out.println("Sum of all Array Elements is: "+sumArray(array, 0));
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static int fibonacci(int m){
        if (m==0){
            return 0;
        } else if (m==1) {
            return 1;
        } else{
            return fibonacci(m-1)+fibonacci(m-2);
        }
    }
    public static int sumArray(int[] arr, int index){
        if (index == arr.length -1){
            return arr[index];
        } else {
            return arr[index] + sumArray(arr,index+1);
        }
    }
}
