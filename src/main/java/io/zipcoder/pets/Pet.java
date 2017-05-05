package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by aurorabanuelos on 5/3/17.
 */
public class Pet implements Comparable<Pet> {

    private String name;
    private String animalType;

    public Pet (String name, String animalType){
        this.name = name;
        this.animalType = animalType;
    }

    public String speak(){
        return "Sound";
    }

    public String getName (){ return name; }
    public String getAnimalType() {return animalType;}


    public int compareTo(Pet anotherPet){
        int compare = this.name.compareTo(anotherPet.getName());
        if(compare == 0){
            return this.animalType.compareTo(anotherPet.getAnimalType());
        }
        else { return compare;
        }
    }




}
