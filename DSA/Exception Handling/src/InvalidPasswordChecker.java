//Q7: Create Custom Exception
//
//Create your own exception:
//
//class InvalidPasswordException extends Exception
//
//Then:
//
//Password must be at least 8 chars
//If not → throw your custom exception


class InvalidPasswordException extends Exception{
    InvalidPasswordException(String message){
        super(message);
    }
}

public class InvalidPasswordChecker {

    public static void passwordChecker(String pass) throws InvalidPasswordException{
        if(pass.length() < 8){
            throw new InvalidPasswordException("The Password is Invalid");
        }
        else{
            System.out.println("Password is Valid");
        }
    }

    public static void main(String[] args){
        try{
            passwordChecker("KartikGarvKaBhai");
        }
        catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
