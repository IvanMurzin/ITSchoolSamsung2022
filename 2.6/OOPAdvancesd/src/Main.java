import game.*;
import geometry.Rectangle;
import geometry.Square;
import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        kill(new Warrior());
//        kill(new Robot(123));
//        kill(new Wizard(20));
//
//        Boat boat = new Boat();
//        Plane plane = new Plane();
//        WaterHelicopter helicopter = new WaterHelicopter();
//
//        swim(boat);
//        swim(helicopter);
//        fly(plane);
//        fly(helicopter);

//
//        Unit[] units = new Unit[4];
//        units[0] = new Robot(121);
//        units[1] = new Wizard(12);
//        units[2] = new Warrior();
//        units[3] = new Robot(312);
//        for (Unit unit : units) {
//            System.out.println(unit);
//        }
//        System.out.println();
//        Arrays.sort(units);
//        for (Unit unit : units) {
//            System.out.println(unit);
//        }


//        System.out.println("Rectangele: ");
//        Rectangle rectangle = new Square(10, 10);
//        System.out.println(rectangle.getArea());
//
//        rectangle.setA(7);
//        System.out.println(rectangle.getArea());
//
//        rectangle.setB(9);
//        System.out.println(rectangle.getArea());
//
//        System.out.println("Square: ");
//        Square square = new Square(5);
//        System.out.println(square.getArea());
//
//        square.setA(10);
//        System.out.println(square.getArea());
//
//        square.setB(7);
//        System.out.println(square.getArea());

//        testArea(new Rectangle(10, 20));
//        testArea(new Rectangle(5, 12));
//        testArea(new Square(5));


        int o = 1;
        System.out.println(o);
    }


    static void testArea(Rectangle rectangle) {
        System.out.println(rectangle.getClass());
        System.out.println(rectangle.getArea());

        rectangle.setA(7);
        System.out.println(rectangle.getArea());

        rectangle.setB(9);
        System.out.println(rectangle.getArea());
    }


    class MyComparator implements Comparator<Unit> {

        @Override
        public int compare(Unit o1, Unit o2) {
            return o1.compareTo(o2);
        }
    }

//    static void swim(Floatable floatable) {
//        floatable.swim();
//    }
//
//    static void fly(Flyable flyable) {
//        flyable.fly();
//    }

//    static void doAct(Unit unit) {
//        System.out.println(unit.name);
//        unit.act();
//        unit.say();
//    }

//    static void kill(Killable killable) {
//        killable.death();
//    }
}