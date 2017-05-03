package BankAccountsTest;

import BankAccounts.Atm;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class AtmTest {

    @Test
    public void requestAmountTest(){
        //Given:
        double amount = 20.00;
        Atm atmVisit = new Atm();

        //When:
        atmVisit.requestAmount(amount);
        double actualResult = atmVisit.getRequestedAmount();
        double expectedResult = 20.00;

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0);


    }

    @Test
    public void selectAccountTest(){
        //Given:
        int option = 1;
        Atm atmVisit = new Atm();

        //When:
        atmVisit.selectAccount(option);
        String actualResult = atmVisit.getAccountType();
        String expectedResult = "Checking";

        //Then:
        Assert.assertEquals(expectedResult, actualResult);

    }
}
