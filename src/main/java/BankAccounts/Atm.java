package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Atm {


    private String accountType;
    private double requestedAmount;

    public void selectAccount(int option) {

        int optionSelection = option;

        switch (optionSelection) {
            case 1:
                accountType = "Checking";
                break;

            case 2:
                accountType = "Savings";
                break;


            case 3:
                accountType = "Business";
                break;

            default:
                System.out.println("Error invalid selection");

        }

    }

    public void requestAmount(double amount){
        requestedAmount = amount;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public String getAccountType() {
        return accountType;
    }
}
