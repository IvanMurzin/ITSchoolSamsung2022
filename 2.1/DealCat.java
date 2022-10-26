public class DealCat extends ColoredCat {
    public final String work = "Google";

    void makeDeal() {
        System.out.println("I made a deal");
    }

    @Override
    public void meow() {
        System.out.println("I'm deal cat" + name + " with " + paws + " paws, DealMeow");
    }
}
