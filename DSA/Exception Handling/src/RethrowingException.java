//Q9: Rethrowing Exception
//
//Write a method:
//
//void methodA()
//Catch exception
//Print something
//Rethrow it
//
//Call from main() and handle again



public class RethrowingException {
    public static void methodA() throws ArithmeticException{
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("Catch in Method");
            throw new ArithmeticException("Sorry");
        }
    }

    public static void main(String[] args){
        try{
            methodA();
        }
        catch (ArithmeticException e){
            System.out.println("Rethrowed Catch " + e.getMessage());
        }
    }
}
