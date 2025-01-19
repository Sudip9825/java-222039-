import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SequentialFileExample {
public static void main(String[] args) {
    String filename="example_seqential.txt";

     try(FileWriter writer=new FileWriter(filename);){
        // Writing to the file sequentially
        writer.write("Line 1: Welcome to Sequential Write.\n");
        writer.write("Line 2: This is the second line.\n");
        writer.write("Line 3: We are writing done.\n");
        System.out.println("Sequential writing done.");
     } catch (IOException e ) {
        System.err.println("Error writing to the file :"+ e.getMessage());


     }

//read
try (BufferedReader read=new BufferedReader(new FileReader(filename))){
    String line;
    //reading file fine by line sequentially
    while ((line = read.readLine())!=null) {
       System.out.println(  line);
    }
}
catch (IOException e){
    System.out.println("error reading the file:" + e.getMessage());
}
    
}
}
