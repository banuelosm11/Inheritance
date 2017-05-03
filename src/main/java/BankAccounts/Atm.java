package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Atm {


    private String accountType;
    private double requestedAmount;
    private boolean requestedType;



    public void selectAccount(int option) {

        int optionSelection = option;

        switch (optionSelection) {
            case 1:
                accountType = "CheckingAccount";
                break;

            case 2:
                accountType = "SavingsAccount";
                break;


            case 3:
                accountType = "BusinessAccount";
                break;

            default:
                System.out.println("Error invalid selection");

        }

    }


    public void requestAmount(double amount){
        requestedAmount = amount;
    }
    public void requestType(boolean request) { requestedType = request;}


   // private String accountName;
//    public void accountFinder(String name) {
//        if(name.equals(getAccountHolder()))
//
//            accountName = getName();
//    }
    // public String getAccountName() {return accountName;}


    public double getRequestedAmount() {
        return requestedAmount;
    }
    public boolean getRequestType() { return requestedType;}


    public String getAccountType() {
        return accountType;
    }
}
