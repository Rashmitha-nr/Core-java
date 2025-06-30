class red extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Red singnal:Stop");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Yellow extends Thread{
    public void run(){
        for(int i=0;i<3;i++) {
            System.out.println("yellow signal:Ready");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
class green extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("green signal:Go");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
public class MultiTreading2 {
    public static void main(String[] args) {
        Thread obj=new red();
        Thread obj1=new Yellow();
        Thread obj2=new green();
        obj.start();
        obj1.start();
        obj2.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
