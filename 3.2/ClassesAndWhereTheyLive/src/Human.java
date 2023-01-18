public class Human {
    private final String name;
    private int age;
    private static int fingersCount = 10;










    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    class Head {
        public static int speechLoud = 1;
        public static final int speechSpeed = 10;
        private final int noseSize;
        private int eyesColor;
        private int hairColor;

        public int getNoseSize() {
            return noseSize;
        }

        public int getEyesColor() {
            return eyesColor;
        }

        public int getHairColor() {
            return hairColor;
        }

        public Head(int noseSize, int eyesColor, int hairColor) {
            this.noseSize = noseSize;
            this.eyesColor = eyesColor;
            this.hairColor = hairColor;
        }

        public void say() {
            System.out.println("Human named " + name + " say: \"Something\"");
        }
    }

    static class Body {
        private int musselsSize;
        private int speed;

        public Body(int musselsSize, int speed) {
            this.musselsSize = musselsSize;
            this.speed = speed;
        }

        public void run() {
            System.out.println("Running with speed: " + speed);
        }
    }

    private static int c = 7;

    public void dance() {
        int a = 5;
        final int b = 1;

        class Move {
            private int direction;

            public void someF() {
                System.out.println(c);
                System.out.println(b);
                System.out.println(b);
            }
        }
    }
}
