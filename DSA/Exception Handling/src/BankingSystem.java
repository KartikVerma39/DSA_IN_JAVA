//Q11: Banking System
//
//Write a program:
//
//Balance = 5000
//Withdraw method
//If amount > balance → throw exception
//Handle properly and print message


public class BankingSystem {
    public static void main(String[] args){

        Bank b = new Bank();

        try{
            b.withdraw(10000);
        }
        catch (InsufficientBalance e){
            System.out.println("You have Insufficient Balance " + e.getMessage());
        }
    }
}
