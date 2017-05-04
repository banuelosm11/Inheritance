package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class CatTests {

    @Test
    public void speakTest(){
        //Given
        Cat pet1 = new Cat("Pet1");
        String expectedResult = "Meow";

        //When
        String actualResult = pet1.speak();

        //Then
        Assert.assertEquals(expectedResult, actualResult);

    }

}
