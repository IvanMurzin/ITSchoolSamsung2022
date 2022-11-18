package transport;

public class WaterHelicopter implements Floatable, Flyable {
    @Override
    public void swim() {
        System.out.println("I am sitting on the water");
    }

    @Override
    public void fly() {
        System.out.println("Helic Helic Helic");
    }
}
