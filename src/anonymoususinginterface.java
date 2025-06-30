interface arithmeticoperation6{
    void add(int a,int b);
    void sub(int a,int b);
}
public class anonymoususinginterface {
    public static void main(String[] args) {
        arithmeticoperation6 obj=new arithmeticoperation6() {
            @Override
            public void add(int a, int b) {
                System.out.println("additon:"+(a+b));
            }

            @Override
            public void sub(int a, int b) {
                System.out.println("sub:"+(a-b));

            }
        };
        obj.add(2,4);
        obj.sub(2,4);

    }
}
