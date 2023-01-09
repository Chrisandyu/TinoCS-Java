
/**
 * Write a description of class P5_AcharBhargav_Vismay_Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P5_AcharBhargav_Vismay_Driver {
    public static void main(String[] args) {
        P5_AcharBhargav_Vismay_Person joe;
        joe = new P5_AcharBhargav_Vismay_Person();

        P5_AcharBhargav_Vismay_Person bob = new P5_AcharBhargav_Vismay_Person(18, 1.72, false, "Bob");
        joe.printInfo();
        joe.increaseAge(5);
        joe.printInfo();

        String answer = bob.getName();
        System.out.println( "Hi, I'm " + answer );
        System.out.println( "My height in inches is " + bob.heightToInches());
        System.out.println("test");
    } 
}

