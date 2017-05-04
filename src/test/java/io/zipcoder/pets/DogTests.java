package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class DogTests {

    @Test
    public void speakTest(){
        //Given
        Dog pet1 = new Dog();
        String expectedResult = "Woof";

        //When
        String actualResult = pet1.speak();

        //Then
        Assert.assertEquals(expectedResult, actualResult);

    }
}
