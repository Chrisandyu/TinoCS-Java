
/**
 * Write a description of class P5_AcharBhargav_Vismay_Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P5_AcharBhargav_Vismay_Driver {
    public static void main(String[] args) {
        P5_AcharBhargav_Vismay_Person bob = new P5_AcharBhargav_Vismay_Person(14, 1.72, false, "Happy Sparky", 314, "Green", false);
        System.out.println("!Hola! Me llamo " + bob.getName());
        System.out.println("Mi color favorito es " + bob.getFavoriteColor());
        System.out.println("Yo tengo " + bob.ageInDogYears() + " anos en anos de perro!");
        System.out.println("... fast forward 15 years ...");
        bob.increaseAge(15);
        System.out.println("Ahora, tengo " + bob.ageInDogYears() + " anos en anos de perro!");
        bob.printSleepState();
        bob.sleep();
        bob.printSleepState();
        

    } 
}

