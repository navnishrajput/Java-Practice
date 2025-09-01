public class Ques_20 {

        private static volatile boolean flag = false;

        public static void main(String[] args) {
            // Thread that waits for flag to become true
            Thread waiter = new Thread(() -> {
                System.out.println("Waiting for flag...");
                while (!flag) {
                    // busy wait
                }
                System.out.println("Flag is true!");
            });

            // Thread that sets flag to true after 1 second
            Thread setter = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = true;
                System.out.println("Flag set to true.");
            });

            waiter.start();
            setter.start();
        }
    }