package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class PetTests {

    @Test
    public void speakTest(){
        //Given
        Pets pet1 = new Pets();
        String expectedResult = "Sound";

        //When
        String actualResult = pet1.speak();

        //Then
        Assert.assertEquals(expectedResult, actualResult);

    }


}
