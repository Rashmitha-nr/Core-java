class R implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Java developer");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class N implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("React developer");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class MultiTreading_using_interface {
    public static void main(String[] args) {
        Runnable obj=new R();
        Runnable obj1=new N();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);

        t1.start();
        t2.start();

    }
}
