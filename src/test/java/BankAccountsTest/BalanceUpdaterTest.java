package BankAccountsTest;

import BankAccounts.CheckingAccount;
import BankAccounts.BalanceUpdater;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class BalanceUpdaterTest {

    @Test
    public void withdrawalOrDepositTest(){
        //Given:
        double requestAmount = 20.00;
        boolean isWithdrawal = true;
        CheckingAccount account1 = new CheckingAccount("Aurora", "Checking", 100.00 );
        BalanceUpdater newRequest = new BalanceUpdater();

        //When:
        newRequest.withdrawalOrDeposit(requestAmount, isWithdrawal, account1);
        double actualResult = account1.getCurrentBalance();
        double expectedResult = 80.00;

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0);

    }
}
