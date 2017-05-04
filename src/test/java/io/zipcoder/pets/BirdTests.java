package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class BirdTests {

    @Test
    public void speakTest(){
        //Given
        Bird pet1 = new Bird("Pet1");
        String expectedResult = "Chirp";

        //When
        String actualResult = pet1.speak();

        //Then
        Assert.assertEquals(expectedResult, actualResult);

    }

}
