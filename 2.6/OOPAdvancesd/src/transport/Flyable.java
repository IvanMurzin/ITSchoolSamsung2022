package transport;

public interface Flyable {
    void fly();

    default void swim() {
        System.out.println("not default swim");
    }
}
