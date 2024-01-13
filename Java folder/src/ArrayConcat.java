public class ArrayConcat {
    public static String ConcatStrings(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Concats", " are", " NOT"," cat", " con", " art", "ists."};
        System.out.println("Concatenated String: " + ConcatStrings(words));
    }
}