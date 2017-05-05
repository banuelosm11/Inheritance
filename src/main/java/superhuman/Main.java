package superhuman;

/**
 * Created by aurorabanuelos on 5/1/17.
 */
public class Main {

    public static void main(String[] args)
    {
        Human aurora = new Human ("Aurora",27,"Female", "Student", "Pennsylvania");
        Human karen = new Human ("Karen", 22, "Female", "Worker", "Delaware");


        SuperHuman batman = new SuperHuman("Bruce", 30, "Male", "Superhero", "Gotham");
        batman.setGood(true);
        batman.setHeroName("Batman");
        batman.setSuperAbility("Vigilante");


        SuperHuman spiderman = new SuperHuman("Peter", 32, "Male", "Superhero", "New York");
        spiderman.setGood(true);
        spiderman.setHeroName("Spiderman");
        spiderman.setSuperAbility("Spidey senses");



        System.out.println(batman.toString());


        System.out.println();
        System.out.println("Is Batman good?: "+ batman.getGood());
        batman.setHeroName("bat2");
        System.out.println("Name changed to: " +batman.getHeroName());


        System.out.println();
        System.out.println("Batman's real name: " + batman.getName());
        batman.setName("BruceWayne");
        System.out.println("Batman's new real name: " + batman.getName());


    }
}
