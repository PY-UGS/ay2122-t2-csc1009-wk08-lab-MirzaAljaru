import java.util.Scanner;

public class BankMain {
    public static void main(String[]args){
        CheckingAccount acc1 = new CheckingAccount();
        Scanner input = new Scanner(System.in);
        try(input) {
            System.out.print("Enter deposit amount: ");
            double deposit_amt = input.nextDouble();
            acc1.deposit(deposit_amt);
            
            System.out.print("Enter Withdraw amount: ");
            double withdraw_amt = input.nextDouble();
            acc1.withdraw(withdraw_amt);

            System.out.printf("The balance after withdraw is $%.2f\n",acc1.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.printf("Sorry but your account is short by: $%.2f\n ",(e.getAmount()-acc1.getBalance()));
        }
    }
}
