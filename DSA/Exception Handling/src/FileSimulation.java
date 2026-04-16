//Q4: File Simulation (no real file needed)
//
//Write a program:
//
//Print "File opened"
//Simulate exception
//In finally, print "File closed"


public class FileSimulation {
    public static void main(String[] args){

        try{
            System.out.println("File Opened");
            System.out.println(5/0);
        }
        catch (ArithmeticException e){
            System.out.println("Not Divisible By Zero");
        }
        finally {
            System.out.println("File is Closed");
        }
    }
}
