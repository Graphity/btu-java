package demo2;

public class Main {
    public static void main(String[] args) {
        Sumable sumable = (x, y) -> x + y;
        System.out.println(sumable.sum(43, 57));
    }
}
