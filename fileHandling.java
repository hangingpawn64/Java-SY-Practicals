import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
        String FileName = "sample.txt";
        String newFileName = "renamed.txt";
        //create file
        try{
            File file = new File(FileName);
            if(file.createNewFile()){
                System.out.println("File created: "+ file.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println(("Error creating file"));
        }

        //Write to File (overwrite)
        try(FileWriter Writer = new FileWriter(FileName)){
            Writer.write("Hello, this is a java file handling demo\n");
            Writer.write("Writing new content\n");
            System.out.println("Data written to file");

        }
        catch(IOException e){
            System.out.println("Error writing file");
        }

        // Append to file

        try(FileWriter Writer = new FileWriter(FileName, true)){
            Writer.write("Appending more data\n");
            System.out.println("Data appended");
        }
        catch(IOException e){
            System.out.println("Error appending file");
        }

        // Read File
        try(BufferedReader reader = new BufferedReader(new FileReader(FileName))){
            String line;
            System.out.println("Reading File \n");
            while((line = reader.readLine()) != null){
                System.out.println((line));
            }
        }
        catch(IOException e){
            System.out.println("Error reading file");
        }
        
        // copy file
        try(FileInputStream fis) = new FileInputStream(){
            FileOutputStream fos = new FileOutputStream("copy.txt")
        }
        
    }
}

