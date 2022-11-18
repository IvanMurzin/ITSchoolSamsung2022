package game;

public abstract class Unit implements Killable, Comparable<Unit> {

    @Override
    public int compareTo(Unit o) {
        if (o.health > health) return 1;
        if (o.health == health) return 0;
        return -1;
    }

    protected String name; // null

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int health;

    public abstract void say();

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Unit(String name) {
        this(name, 120);
//        this.name = name;
//        this.health = 120;
    }

    public Unit() {
        this("Unit");
    }

    @Override
    public String toString() {
        return name + " health=" + health;
    }

    public final void act() {
        System.out.println("Act like unit");
    }

    public void act(String smth) {
        System.out.println(smth);
    }
}
