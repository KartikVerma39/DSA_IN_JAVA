//Q8: Nested try-catch
//
//Write program:
//
//Inside try → another try
//Inner throws exception
//Handle inner and outer differently


public class NestedTryCatch {
    public static void main(String[] args){

        try {
            System.out.println("Outer Try Works");

            try{
                System.out.println("Inner Try Works");
                System.out.println(10/0);
            }
            catch (ArithmeticException e){
                System.out.println("Can't Divide By Zero");
            }

            System.out.println("Outer Try Continues");
        }
        catch (Exception e){
            System.out.println("Something Went Wrong");
        }

        System.out.println("ENDING");
    }
}
