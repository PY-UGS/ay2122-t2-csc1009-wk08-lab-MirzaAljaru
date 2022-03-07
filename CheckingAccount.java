public class CheckingAccount {
    private double balance;
    private String acc_number;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException(amount);
        }
        else if( amount < balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }
    
    public String getNumber(){
        return this.acc_number;
    }



    }


