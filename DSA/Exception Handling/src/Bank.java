public class Bank{
    int balance;

    Bank(){
        this.balance = 5000;
    }

    public void withdraw(int amount) throws InsufficientBalance {
        if(amount > balance){
            throw new InsufficientBalance("Sorry Your Balance is Very Less");
        }
        else{
            balance -= amount;
        }
    }
}