//Q1: Handle Division
//
//Write a program that:
//
//Takes two integers
//Divides them
//Handles division by zero
//Prints "Cannot divide by zero" if error occurs

public class HandleDivision {
    public static void main(String[] args){
        int number = 5;
        int divisor = 0;

        try{
            System.out.println(number/divisor);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot Divide By Zero");
        }
    }
}
