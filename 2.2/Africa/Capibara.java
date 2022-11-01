package Africa;

public class Capibara {

    public static int count = 0;

    final private String name;

    public Capibara(String name) {
        count += 1;
        System.out.println("I am capibara constructor");
        this.name = name;
    }

    public void a(Capibara capibara){
        System.out.println(capibara.name);
    }

    public void voice() {
        System.out.println("I am capibara");
    }

    @Override
    public String toString() {
        return "I am capibara with name: " + name;
    }
}
