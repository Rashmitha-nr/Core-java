class rash extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("java developer");
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

}
class nick extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("react developer");
            try {
                Thread.sleep(1000);
            }
                catch(Exception e){
                    System.out.println(e);
                }
            }

        }
    }

public class MultiThreading1 {
    public static void main(String[] args) {
        Thread obj=new rash();
        Thread obj1=new nick();
        obj.start();
        obj1.start();


    }
}
