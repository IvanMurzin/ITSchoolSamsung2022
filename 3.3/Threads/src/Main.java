public class Main {

    private static Integer money = 100;

    static class Client implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (money) {
                if (money - 70 > 0) {
                    System.out.println("I'm buying");
                    // bancomat stuff
                    bancomatStuff();
                    money -= 70;
                    System.out.println("Money: " + money);
                } else {
                    System.out.println("Need more money");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        private void bancomatStuff() {
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
            }
        }
    }


    static class MyHouse {
        boolean isPelmeniReady = false;

        public synchronized void eatPelmeni() {
            try {
                while (!isPelmeniReady) {
                    System.out.println("Я томно жду");
                    wait();
                    System.out.println("Я дождался, Ура!");
                }
                System.out.println("Омномноммном");
            } catch (Exception e) {
            }
        }

        public synchronized void pelmeniCooked() throws InterruptedException {
            System.out.println("Начал готовить");
            Thread.sleep(2000);
            isPelmeniReady = true;
            System.out.println("Готово!");
            notifyAll();
        }
    }


    public static void main(String[] args) throws InterruptedException {
//        Client client1 = new Client();
//        Client client2 = new Client();
//
//        System.out.println("Before");
//        new Thread(client1).start();
//        new Thread(client2).start();
//        System.out.println("After");

        MyHouse house = new MyHouse();
        new Thread(new Runnable() {
            @Override
            public void run() {
                house.eatPelmeni();
            }
        }).start();
        Thread.sleep(1000);
        house.pelmeniCooked();
    }
}



