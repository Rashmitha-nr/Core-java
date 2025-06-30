import java.io.FileOutputStream;

public class FileOutputStream_creating_insertingdata_intoafile {
    public static void main(String[] args) {
        try{
            FileOutputStream op=new FileOutputStream("python.text");
            System.out.println("file created Successfdully");
        }
        catch (Exception e){
            System.out.println(e);
        }
        String content="python is a high level programming language";
        try {
            FileOutputStream op1 = new FileOutputStream("python.txt");
            byte[] bytes =content.getBytes();
            op1.write(bytes);
            System.out.println("inserted");
            op1.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
