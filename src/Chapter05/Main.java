package Chapter05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
        }

        System.out.println("End.");

        System.out.println("===================================");

        // 연습문제 5-1
        System.out.println("Start.");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");

        System.out.println("===================================");

        // 연습문제 5-2
        System.out.println("Start.");
        for (int i = 0; i < 6; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}
