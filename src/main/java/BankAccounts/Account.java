package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public abstract class Account {

    private String accountHolder;
    private String accountType;
    private double currentBalance;

    public Account(String accountHolder, String accountType, double currentBalance){
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
    }

    public abstract void getAccountSummary();

    public String getAccountHolder(){
        return accountHolder;
    }

    public String getAccountType(){
        return accountType;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public void setCurrentBalance(double newBalance){
        currentBalance = newBalance;
    }



}
