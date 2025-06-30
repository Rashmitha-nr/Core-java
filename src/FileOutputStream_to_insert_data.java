import java.io.FileOutputStream;

public class FileOutputStream_to_insert_data {
    public static void main(String[] args) throws Exception{
        String Content="Hi! How are you";
        try(FileOutputStream op=new FileOutputStream("one.csv")){
            byte[] bytes=Content.getBytes();
            op.write(bytes);
            System.out.println("inserted Successfully");
            op.close();
        }



    }
}
