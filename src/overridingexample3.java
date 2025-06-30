class x{
    void config(String RAM,String display,String processor,String battery){
        System.out.println("RAM:"+RAM+" "+"display:"+display+" "+"processor:"+processor+" "+"battery:"+battery);
    }
}
class y extends x{
    @Override
    void config(String RAM,String display, String processor, String battery) {
        super.config(RAM,display, processor, battery);
    }
}
public class overridingexample3 {
    public static void main(String[] args) {
        y obj=new y();
        obj.config("12GB","AMOLED","Exynos","5000mAh");
        obj.config("16GB","LCD","MediaTek","45000mAh");

    }
}
