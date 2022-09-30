public class Main {
    public static void main(String[] args) {
        char[] chars = new char[10];
        char[] copyChars = chars;
        for (int i = 0; i < copyChars.length; i++) {
            copyChars[i] = (char) ('a' + i);
        }
    }
}