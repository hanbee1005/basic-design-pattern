package Chapter09;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        RandomCountDisplay randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("Hello, Random."));
        randomCountDisplay.randomDisplay(10);

        CountDisplay fileDisplay = new CountDisplay(new FileDisplayImpl("start.txt"));
        fileDisplay.multiDisplay(3);

        IncreaseDisplay increaseDisplay1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay increaseDisplay2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        increaseDisplay1.increaseDisplay(4);
        increaseDisplay2.increaseDisplay(6);
    }
}
