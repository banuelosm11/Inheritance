package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by aurorabanuelos on 5/5/17.
 */
public class PetComparator implements Comparator<Pet> {


    @Override
    public int compare(Pet o1, Pet o2) {
        int compare = o1.getAnimalType().compareTo(o2.getAnimalType());
        if(compare == 0){
            return o1.getName().compareTo(o2.getName());
        }else{
            return compare;
        }
    }
}
