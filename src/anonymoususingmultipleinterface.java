interface AO1{
    void mul(int a,int b);
}
interface AO2{
    void div(float a,float b);
}
public class anonymoususingmultipleinterface {
    public static void main(String[] args) {
        AO1 obj=new AO1() {
            @Override
            public void mul(int a, int b) {
                System.out.println(a*b);

            }
        };
        obj.mul(5,5);

        AO2 obj1=new AO2() {
            @Override
            public void div(float a, float b) {
                System.out.println(a/b);
            }
        };
        obj1.div(3,9);

    }
}
