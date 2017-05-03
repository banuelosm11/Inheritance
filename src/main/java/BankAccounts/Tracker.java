package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Tracker {

    private double updatedBalance;

    public void withdrawal(double requestAmount, boolean requestType, Account account1){

        if (requestType == true && (requestAmount < account1.getCurrentBalance())) {

            updatedBalance = account1.getCurrentBalance() - requestAmount;

            account1.setCurrentBalance(updatedBalance);

        }
        else if (requestType == false){

            updatedBalance = account1.getCurrentBalance() + requestAmount;

            account1.setCurrentBalance(updatedBalance);
        }

        else{
            System.out.println("insufficient funds");
        }
    }
}
