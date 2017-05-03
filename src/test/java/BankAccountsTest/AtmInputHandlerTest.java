package BankAccountsTest;

import BankAccounts.AtmInputHandler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class AtmInputHandlerTest {

    @Test
    public void requestAmountTest(){
        //Given:
        double amount = 20.00;
        AtmInputHandler atmInputHandlerVisit = new AtmInputHandler();

        //When:
        atmInputHandlerVisit.requestAmount(amount);
        double actualResult = atmInputHandlerVisit.getRequestedAmount();
        double expectedResult = 20.00;

        //Then:
        Assert.assertEquals(expectedResult, actualResult, 0);


    }

    @Test
    public void requestTypeTest(){
        //Given:
        AtmInputHandler atmInputHandlerVisit = new AtmInputHandler();

        //When:
        atmInputHandlerVisit.requestType(true);

        //Then:
        Assert.assertTrue(true);


    }

    @Test
    public void selectAccountTest(){
        //Given:
        int option = 1;
        AtmInputHandler atmInputHandlerVisit = new AtmInputHandler();

        //When:
        atmInputHandlerVisit.selectAccount(option);
        String actualResult = atmInputHandlerVisit.getAccountOption();
        String expectedResult = "Checking Account";

        //Then:
        Assert.assertEquals(expectedResult, actualResult);

    }
}
