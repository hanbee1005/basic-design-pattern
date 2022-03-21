package Chapter08;

import Chapter08.factory.Factory;
import Chapter08.factory.Link;
import Chapter08.factory.Page;
import Chapter08.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "https://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "https://www.chosun.com/");

        Link naver = factory.createLink("NAVER", "https://www.naver.com/");
        Link daum = factory.createLink("Daum", "https://www.daum.net/");
        Link excite = factory.createLink("Excite", "https://www.exite.com/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(chosun);

        Tray traysearch = factory.createTray("검색엔진");
        traysearch.add(naver);
        traysearch.add(daum);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
