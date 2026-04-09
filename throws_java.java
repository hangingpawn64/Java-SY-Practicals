import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class throws_java {
    static void readFile(String fileName)
        throws IOException{
            FileReader file = new FileReader(fileName);
        }
    public static void main(String[] args) {
        try{
            readFile("test.txt");
        }
        catch(IOException e){
            System.out.println("FileNotFound "+ e.getMessage());
        }
    }
}
