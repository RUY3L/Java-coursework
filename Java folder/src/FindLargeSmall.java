public class FindLargeSmall {
    public static void minMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
    public static void main(String[] args) {
        int[] myIntArr = {7,2,3,1,5,6};
        minMax(myIntArr);
    }


}