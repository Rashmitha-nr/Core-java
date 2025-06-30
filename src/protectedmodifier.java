class protected1{
    protected void dis(int a,int b){
        System.out.println(a+b);

    }
}
public class protectedmodifier {
    public static void main(String[] args) {
        protected1 obj=new protected1();
        obj.dis(1,5);

    }
}
