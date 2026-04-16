import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUnchecked {

    public static void checkedExample() throws IOException{
        FileReader file = new FileReader("test.txt");
        file.read();
        file.close();
    }

    public static void uncheckedExample() throws ArithmeticException{
        System.out.println(10/0);
    }

    public static void main(String[] args){

        try{
            checkedExample();
        }
        catch (IOException e){
            System.out.println("THIS IS A CHECKED EXCEPTION");
        }

        try{
            uncheckedExample();
        }
        catch (ArithmeticException e){
            System.out.println("THIS IS AN UNCHECKED EXCEPTION");
        }
    }
}
