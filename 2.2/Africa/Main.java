package Africa;

import lib.ChildCapibara;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Fraction1:");
//        Africa.Fraction fraction1 = new Africa.Fraction(18, 30);
//        System.out.println(fraction1);
//        System.out.println(fraction1.toDecimal());
//
//        System.out.println();
//        System.out.println("Fraction2:");
//        Africa.Fraction fraction2 = new Africa.Fraction(7); // new Africa.Fraction(7, 1);
//        System.out.println(fraction2);
//        System.out.println(fraction2.toDecimal());
//
//        System.out.println();
//        System.out.println("Fraction3:");
//        Africa.Fraction fraction3 = new Africa.Fraction(); // new Africa.Fraction(0); new Africa.Fraction(0,1);
//        System.out.println(fraction3);
//        System.out.println(fraction3.toDecimal());

//        Capibara capibara1 = new Capibara("1");
//        Capibara capibara2 = new Capibara("2");
//        Capibara capibara3 = new Capibara("3");
//        Capibara capibara4 = new Capibara("4");
//        Capibara capibara5 = new Capibara("5");
//        Capibara capibara6 = new Capibara("6");
//
//        ChildCapibara childCapibara = new ChildCapibara("asd", capibara1);
//        capibara1.a(capibara2);
//        capibara1.a(childCapibara);
//        System.out.println("All capibaras = " + Capibara.count);

        byte b = -2;
        for (int i = 7; i >= 0; i--) {
            int mask = 1 << i;
            System.out.print((b & mask) == 0 ? '0' : '1');
        }
    }
}
