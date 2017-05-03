package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Main {



    public static void main(String[] args) {

        CheckingAccount aurorachecking = new CheckingAccount("Aurora", "Checking", 400.00);
        SavingsAccount aurorasaving = new SavingsAccount("Aurora", "Saving", 200.00);
        BusinessAccount business = new BusinessAccount("CoffeeShop", "Business", 1200.00);
        CheckingAccount karenchecking = new CheckingAccount("Karen", "Checking", 300.00);


        Atm atmVisit = new Atm();
        Tracker newRequest = new Tracker();

        atmVisit.selectAccount(1);
        atmVisit.requestAmount(40.00);
        atmVisit.requestType(true);
        //atmVisit.accountFinder("Aurora");

        //newRequest.withdrawalOrDeposit(atmVisit.getRequestedAmount(), atmVisit.getRequestType(), atmVisit.getAccountName());

        //aurorachecking.getCurrentBalance();

    }
}
