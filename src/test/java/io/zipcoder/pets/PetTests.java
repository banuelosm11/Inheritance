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
        Pet pet1 = new Pet("Pet1", "animal");
        String expectedResult = "Sound";

        //When
        String actualResult = pet1.speak();

        //Then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void nameGetterTest(){
        //Given
        Pet pet1 = new Pet("Pet1", "animal");

        //When
        String pet1Name = pet1.getName();

        //Then
        Assert.assertEquals("Pet1", pet1Name);
    }

    @Test
    public void compareToTest(){
        //Given
        Pet pet1 = new Pet("buster", "dog");
        Pet pet2 = new Pet("annie", "cat");

        //When
        int x = pet1.compareTo(pet2);

        //Then
        Assert.assertEquals(1, x);
    }



}
