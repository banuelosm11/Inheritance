package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String accountHolder, String accountType, double currentBalance){
        super(accountHolder, accountType, currentBalance);
    }


    public void getAccountSummary(){
        System.out.println( getAccountHolder() + "/ " + getAccountType());
        System.out.println("Current balance: " + getCurrentBalance());
    }
}
