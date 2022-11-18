package game;

public class Robot extends Unit {
    private int armor;

    public Robot(int armor) {
        super("Robot", 100);
        this.armor = armor;
    }

    public void roboAttack(Unit unit) {
        System.out.println("Robo attack");
    }

    @Override
    public void say() {
        System.out.println("Bzz");
    }

    @Override
    public String toString() {
        return super.toString() + " armor=" + armor;
    }

    @Override
    public void act(String smth) {
        System.out.println("Act like robot");
    }

    @Override
    public void death() {

    }

    @Override
    public void onKill() {

    }
}
