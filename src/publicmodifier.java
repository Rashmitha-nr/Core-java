class public1{
    public void disp(String name){
        System.out.println(name);
    }
}
public class publicmodifier {
    public static void main(String[] args) {
        public1 obj=new public1();
        obj.disp("Rashmi");

    }
}
