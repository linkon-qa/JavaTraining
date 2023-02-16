import entities.Account;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Account account;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter with the account number ");
       int accountNumber = scanner.nextInt();
       System.out.print("Enter with account holder ");
       scanner.nextLine();
       String holder = scanner.nextLine();
       System.out.print("Is there a initial deposit (y/n) ");
       char response = scanner.next().charAt(0);
       if(response == 'y'){
          System.out.print("Enter with initial deposit value ");
          double initialDeposit = scanner.nextDouble();
          account = new Account(accountNumber, holder, initialDeposit);
       }
       else {
          account = new Account(accountNumber, holder);
       }
       System.out.println(account.toString());
       System.out.print("Enter a deposit value: ");
       double value = scanner.nextDouble();
       account.deposit(value);
       System.out.println(account.toString());
       System.out.print("Enter a withdraw value: ");
       value = scanner.nextDouble();
       account.withdraw(value);
       System.out.println(account.toString());

       scanner.close();

    }
}