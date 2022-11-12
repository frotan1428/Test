package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        goAndReadThFile();

    }
    public static void goAndReadThFile(){
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\MF\\IdeaProjects\\Test\\src\\exception\\File.txt");
            int k = 0;

            while( (k=fis.read()) != -1){
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about reaching  out the file or exiting of the file "+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Connection with cloud was broken");
        }
    }
}
