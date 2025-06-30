class W1 implements Runnable {
    public void run() {
        for (int i = 10; i <= 50; i += 10) {
            System.out.println(i);
            if(i==50) {
                System.out.println("filled");
            }
            else{
                System.out.println("filling");
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
            }
        }
    public class Multitreading_using_runnable_interface {
        public static void main(String[] args) {
            Runnable W1 = new W1();
            Thread t1 = new Thread(W1);
            t1.start();

        }
    }

