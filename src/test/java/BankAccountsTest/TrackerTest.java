package BankAccountsTest;

import BankAccounts.CheckingAccount;
import BankAccounts.Tracker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class TrackerTest {

    @Test
    public void withdrawalTest(){
        //Given:
        double requestAmount = 20.00;
        boolean isWithdrawal = true;
        CheckingAccount account1 = new CheckingAccount("Aurora", "Checking", 100.00 );
        Tracker newRequest = new Tracker();

        //When:
        newRequest.withdrawal(requestAmount, isWithdrawal, account1);
        double actualResult = account1.getCurrentBalance();
        double expectedResult = 80.00;

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0);

    }
}
