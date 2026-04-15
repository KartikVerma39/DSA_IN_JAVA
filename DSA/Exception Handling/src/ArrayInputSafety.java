//Q2: Array Input Safety
//
//        Write a program:
//
//        Create an array of size 5
//        Take index from user
//        Print element at that index
//        Handle invalid index using exception



import java.util.Scanner;

public class ArrayInputSafety {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        int index;
        System.out.print("Please Provide The Index : ");
        index = scanner.nextInt();

        try{
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you gave is Out Of Bounds");
        }
    }
}
