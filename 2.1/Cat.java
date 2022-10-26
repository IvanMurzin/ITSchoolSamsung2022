public class Cat {
    // поля - свойства
    // методы - действия над полями
    protected int paws = 4;
    protected String name = "Barsik";

    public int getPaws() {
        return paws;
    }

    public String getName() {
        return name;
    }

    public void setName(String catName) {
        name = catName;
    }

    public void setPaws(int paws) {
        if (paws < 0) {
            System.out.println("Ай-ай-ай!");
            return;
        }
        this.paws = paws;
    }

    void meow() {
        System.out.println("I'm " + name + " with " + paws + " paws, Meow");
    }

    @Override
    public String toString() {
        return "Cat{paws=" + paws + ";name=" + name + "}";
    }
}
// Есть кошка, у которой 4 лапы, длинный хвост и она умеет мяукать
