//Q3: Multiple Catch
//
//Write a program that:
//
//Takes a number as string input
//Converts to integer
//Divides 100 by that number
//Handle:
//Invalid number (NumberFormatException)
//Division by zero

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Your Number : ");
        String s = scanner.next();

        try {
            int num = Integer.parseInt(s);
            System.out.println(100/num);
        }
        catch (ArithmeticException e){
            System.out.println("Number cannot be Divided By Zero");
        }
        catch (NumberFormatException e){
            System.out.println("The Number Format is Incorrect");
        }


        scanner.close();
    }
}
