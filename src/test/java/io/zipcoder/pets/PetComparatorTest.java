package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 5/5/17.
 */
public class PetComparatorTest {

    @Test
    public void compareTest(){
        //Given
        Pet pet1 = new Pet("buster", "dog");
        Pet pet2 = new Pet("annie", "cat");
        PetComparator comp = new PetComparator();

        //When
        int x = comp.compare(pet1, pet2);

        //Then
        Assert.assertEquals(1, x);
    }
}
