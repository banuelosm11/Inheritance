package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class AtmInputHandler {


    private String accountOption;
    private double requestedAmount;
    private boolean requestedType;
    private Account accountClassName;



    public void selectAccount(int option) {

        int optionSelection = option;

        switch (optionSelection) {
            case 1:
                accountOption = "Checking Account";
                break;

            case 2:
                accountOption = "Savings Account";
                break;


            case 3:
                accountOption = "Business Account";
                break;

            default:
                System.out.println("Error invalid selection");

        }

    }


    public void requestAmount(double amount){
        requestedAmount = amount;
    }
    public void requestType(boolean request) { requestedType = request;}



//    public void accountFinder(String name) {
//        if (name.equals(getAccountHolder()) && accountOption.equals(getAccountType())) {
//
//            accountClassName = getName();
//        }
//    }



    public double getRequestedAmount() {
        return requestedAmount;
    }
    public boolean getRequestType() { return requestedType;}
    public Account getAccountClassName() {return accountClassName;}
    public String getAccountOption() {
        return accountOption;
    }
}
