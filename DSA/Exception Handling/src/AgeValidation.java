class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class AgeValidation {
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("You are Not Eligible");
        }
        else{
            System.out.println("You are Eligible");
        }
    }

    public static void main(String[] args){
        try{
            checkAge(17);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
