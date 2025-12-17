package in.kgcoding.challange88;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class RobustFileReader {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the fileName which you want to read: ");
        String fileName =input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.print((char) read);
            }
        }catch(FileNotFoundException f){
            System.out.printf("%s Not fount : ",fileName);
        }
        catch(IOException e){
            System.out.printf("Exception occured:%s",e.getMessage());
        }
    }
}
