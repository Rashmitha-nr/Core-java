import java.io.File;
import java.io.FileWriter;

public class create_newfile_insertdata {
    public static void main(String[] args) throws Exception {
        File file=new File("details.txt");
        if(file.createNewFile()){
            System.out.println("file created Successfully");
        }
        else {
            System.out.println("Try again");
        }
        FileWriter w=new FileWriter("details.txt");
        w.write("name:Rashmitha age:22");
        System.out.println("data is inserted");
        w.close();
    }
}
