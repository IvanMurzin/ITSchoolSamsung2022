import java.util.Collections;

public class Main {


    public static void feedCat(Cat cat) {
        cat.setPaws(cat.getPaws() + 1);
        cat.meow();
    }

    public static void getScience(ScienceCat cat) {
        cat.makeScienceStaff(1);
    }

    public static void main(String[] args) {
//        Cat barsik = new Cat();
//        barsik.setName("Barsik");
//        barsik.meow();
//        Cat anatoliy = new Cat();
//        anatoliy.setName("Anatoliy");
//        anatoliy.setPaws(5);
//        anatoliy.meow();
//
//        ColoredCat kuzya = new ColoredCat();
//        kuzya.setName("Kuzya");
//        kuzya.setPaws(10);
//        kuzya.setColor("Red");
//        kuzya.meow();
//
//        DealCat evgraph = new DealCat();
//        evgraph.setName("Evgraph");
//        evgraph.setPaws(3);
//        evgraph.meow();
//        evgraph.setColor("Black");
//        evgraph.makeDeal();
//        Cat dealCat = new DealCat();
//        Cat coloredCat = new ColoredCat();
//        Cat cat = new Cat();
//
//        feedCat(dealCat);
//        feedCat(coloredCat);
//        feedCat(cat);
//        Object o = new DealCat();
//        System.out.println(o);
        ScienceCat cat = new ScienceCrazyCat();

    }
}