import java.io.File;

public class filehanling_creating_a_file {
    public static void main(String[] args) throws Exception {
        File file=new File("abc.txt");           //String a="abc.txt";
        if(file.createNewFile()) {                          //File file=new File(a);creating the file
            System.out.println("file created successfully");
        }
            else{
                System.out.println("try again");
            }
        }
    }

