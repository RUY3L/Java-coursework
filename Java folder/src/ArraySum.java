public class ArraySum {
    public static int SumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] Nums = {2,5,1,23,51,73,93,86};
        System.out.println("Sum of array elements: " + ArraySum.SumArray(Nums));
    }
}