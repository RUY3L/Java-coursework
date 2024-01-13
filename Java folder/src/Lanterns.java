public class Lanterns {
    public static void main(String[] args) {

        Top();
        $n();
        Top();
        $s();$n();
        $d(13);$n();
        Top();
        $n();
        Top();
        $a(4); $d(5);$n();
        $s();$n();
        $s();$n();
        $a(4); $d(5);$n();
        $a(4); $d(5);$n();

    }
    static void $a(Integer num) {
        String str = " ";
        System.out.print(str.repeat(num));
    }
    static void $d(Integer num) {
        String str = "*";
        System.out.print(str.repeat(num));
    }
    static void Top() {
        $a(4); $d(5);$n();
        $a(2); $d(9);$n();
        $d(13);$n();
    }
    static void $s() {
        String str = "* | | | | | *";
        System.out.print(str);
    }static void $n() {
        System.out.println();
    }
}