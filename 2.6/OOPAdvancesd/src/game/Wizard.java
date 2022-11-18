package game;

public class Wizard extends Unit {
    private int mana;

    public Wizard(int mana) {
        super("Wizard", 50);
        this.mana = mana;
    }

    @Override
    public void say() {
        System.out.println("Wizards rule!");
    }

    @Override
    public String toString() {
        return super.toString() + " mana=" + mana;
    }

    @Override
    public void death() {

    }

    @Override
    public void onKill() {

    }

//    public void act() {
//        System.out.println("Act like wizard");
//    }
}
