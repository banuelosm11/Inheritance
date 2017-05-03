package BankAccounts;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Main {



    public static void main(String[] args) {

        CheckingAccount aurorachecking = new CheckingAccount("Aurora", "Checking Account", 400.00);
        SavingsAccount aurorasaving = new SavingsAccount("Aurora", "Savings Account", 200.00);
        BusinessAccount business = new BusinessAccount("CoffeeShop", "Business Account", 1200.00);
        CheckingAccount karenchecking = new CheckingAccount("Karen", "Checking Account", 300.00);


        AtmInputHandler atmInputHandlerVisit = new AtmInputHandler();
        BalanceUpdater newRequest = new BalanceUpdater();

        atmInputHandlerVisit.selectAccount(1);
        atmInputHandlerVisit.requestAmount(40.00);
        atmInputHandlerVisit.requestType(true);
        //atmInputHandlerVisit.accountFinder("Aurora");

        newRequest.withdrawalOrDeposit(atmInputHandlerVisit.getRequestedAmount(), atmInputHandlerVisit.getRequestType(), atmInputHandlerVisit.getAccountClassName());

        aurorachecking.getCurrentBalance();

    }
}
