package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aurorabanuelos on 5/4/17.
 */
public class UserInput {

    Scanner in = new Scanner(System.in);

    ArrayList<Pet> petInfoList = new ArrayList();

    public void askAboutPets(){

        System.out.println("How many pets do you have?");
        int numberOfPets = in.nextInt();

        for (int i = 0; i < numberOfPets; i++){

            System.out.println("What is your pet name?");
            String name = in.next();

            System.out.println("What type is your pet?");
            String type = in.next();

            if (type.equalsIgnoreCase("Bird")){
                petInfoList.add(new Bird(name));
            } else if (type.equalsIgnoreCase("Dog")){
                petInfoList.add(new Dog(name));
            } else if (type.equalsIgnoreCase("Cat")){
                petInfoList.add(new Cat(name));
            } else {
                petInfoList.add(new Pet(name));
            }

        }

        System.out.println("Here is a list of your pets:");
        for (Pet e : petInfoList)
            System.out.println("Name: " + e.getName() + " Type: " + e.getClass().getSimpleName() + " Says: " + e.speak());

    }



}


