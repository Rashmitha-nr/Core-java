class chat extends Thread{
    String user;
    String[] message;
    public chat(String user,String[] message){
        this.user=user;
        this.message=message;
    }

    public void run(){
        for(String msg:message) {
            System.out.println(user + ":" + msg);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class Multitreading_using_arrays {
    public static void main(String[] args) {
        String[] user1={"Hi","How r u","hd Lunch","where are you"};
        String[] user2={"Hello","I am fine","Hd ","in Hoskote"};

        Thread t1=new chat("Nikhil",user1);
        Thread t2=new chat("rashmi",user2);

        t1.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
