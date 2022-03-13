package Chapter02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();

        Print2 p2 = new PrintBanner2("World");
        p2.printWeak();
        p2.printStrong();

        try {
            FileIO fileIO = new FileProperties();
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year", "2022");
            fileIO.setValue("month", "3");
            fileIO.setValue("day", "13");
            fileIO.writeToFile("newfile.txt");
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
