package Chapter05;

public class TicketMaker {
    private static TicketMaker singleton = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
        System.out.println("인스턴스가 생성되었습니다.");
    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
