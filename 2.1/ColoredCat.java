public class ColoredCat extends Cat {
    private String color = "Grey";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void meow() {
        System.out.println("I'm " + color + "  " + name + " with " + paws + " paws, ColoredMeow");
    }
}