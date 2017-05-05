package io.zipcoder.pets;

import java.util.*;

/**
 * Created by aurorabanuelos on 5/4/17.
 */
public class UserInput {

    Scanner in = new Scanner(System.in);



    public void askAboutPets(){

        ArrayList<Pet> petInfoList = new ArrayList();

        System.out.println("How many pets do you have?");
        int numberOfPets = in.nextInt();

        for (int i = 0; i < numberOfPets; i++){

            System.out.println("What is your pet name?");
            String name = in.next();

            System.out.println("What type is your pet?");
            String animalType = in.next();

            if (animalType.equalsIgnoreCase("Bird")){
                petInfoList.add(new Bird(name, animalType));
            } else if (animalType.equalsIgnoreCase("Dog")){
                petInfoList.add(new Dog(name, animalType));
            } else if (animalType.equalsIgnoreCase("Cat")){
                petInfoList.add(new Cat(name, animalType));
            } else {
                petInfoList.add(new Pet(name, animalType));
            }

        }

        Collections.sort(petInfoList);

        Collections.sort(petInfoList, new PetComparator());

        System.out.println("Here is a list of your pets:");
        for (Pet e : petInfoList)
            System.out.println("Name: " + e.getName() + " Type: " + e.getAnimalType() + " Says: " + e.speak());

    }



}


