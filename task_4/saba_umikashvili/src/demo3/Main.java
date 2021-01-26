package demo3;

public class Main {
    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        SamsungNote samsungNote = new SamsungNote();
        Nokia nokia = new Nokia();
        Panasonic panasonic = new Panasonic();
        printSmartphone(iphoneX);
        printSmartphone(samsungNote);
        printSimbian(nokia);
        printSimbian(panasonic);
    }

    public static <E extends Smartphone> void printSmartphone(E e) {
        System.out.println(e);
    }

    public static <E extends Simbian> void printSimbian(E e) {
        System.out.println(e);
    }
}
