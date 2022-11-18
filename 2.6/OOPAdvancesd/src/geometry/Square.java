package geometry;

public class Square extends Rectangle {

    public Square(int a) {
        super(a, a);
    }

    public Square(int a, int b) {
        super(a, a);
    }

    @Override
    public void setB(int b) {
        super.setA(b);
        super.setB(b);
    }

    @Override
    public void setA(int a) {
        super.setA(a);
        super.setB(a);
    }
}
