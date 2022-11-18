package transport;

import java.util.Random;
import java.util.Scanner;

public class AnotherMain {

    interface Reader {
        char getChar();
    }

    static final class Keyboard implements Reader {
        public char getChar() {
            Scanner in = new Scanner(System.in);
            return (char) in.nextInt();
        }

        public void claz() {
            System.out.println("claz claz");
        }

        public void getFood() {
            System.out.println("Omnomnom");
        }
    }

    static class Printer {
        public void putChar(char c) {
            System.out.println((int) c);
        }
    }

    static class TouchPadReader implements Reader {
        public char getChar() {
            return (char) new Random().nextInt();
        }
    }

    static class FileReader implements Reader {
        public char getChar() {
            return (char) new Random().nextInt();
        }
    }

    static class CharCopier {
        public void copy(Reader keyboard, Printer printer) {
            for (int i = 0; i < 3; i++) {
                printer.putChar(keyboard.getChar());
            }
        }
    }


    public static void main(String[] args) {
        CharCopier copier = new CharCopier();
        Keyboard keyboard = new Keyboard();
        Printer printer = new Printer();
        TouchPadReader reader = new TouchPadReader();
        copier.copy(new FileReader(), printer);
    }
}
