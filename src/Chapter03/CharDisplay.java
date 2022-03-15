package Chapter03;

public class CharDisplay extends AbstractDisplay {
    private char character;

    public CharDisplay(Character c) {
        this.character = c;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(character);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
