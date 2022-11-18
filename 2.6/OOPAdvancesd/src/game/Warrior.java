package game;

final public class Warrior extends Unit {
    @Override
    public void say() {
        System.out.println("Arrr!");
    }

    public Warrior() {
        super("Warrior", 200);
    }

    public void attack() {
        System.out.println("Attack!");
    }

    @Override
    public String toString() {
        return super.toString() + " arrrrr!";
    }

    @Override
    public void death() {

    }

    @Override
    public void onKill() {

    }

//    public void act() {
//        System.out.println("Act like warrior");
//    }
}
