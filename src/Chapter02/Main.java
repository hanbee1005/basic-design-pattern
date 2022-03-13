package Chapter02;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();

        Print2 p2 = new PrintBanner2("World");
        p2.printWeak();
        p2.printStrong();
    }
}
