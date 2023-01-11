
/**
 * Write a description of class P5_AcharBhargav_Vismay_Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P5_AcharBhargav_Vismay_Person{
    int myAge;          // Age in years
    double myHeight;    // Height in meters
    boolean isFemale;   // True if female, false if male
    String myName;      // Person's name
    int myFavoriteNumber;
    String myFavoriteColor;
    boolean isSleeping;

    public P5_AcharBhargav_Vismay_Person() {        
        myAge = 17;
        myHeight = 1.53;
        isFemale = true;
        myName = "Frances";
        myFavoriteNumber = 21;
        myFavoriteColor = "Blue";
        isSleeping = false;
    }

    public P5_AcharBhargav_Vismay_Person(int age, double height, boolean female, String name, int number, String color, boolean sleeping){
        myAge = age;
        myHeight = height;
        isFemale = female;
        myName = name;
        myFavoriteNumber = number;
        myFavoriteColor = color;
        isSleeping = sleeping;
    }

    public double heightToInches() {
        // 1 meter = 39.97 inches
        double answer = myHeight * 39.97;
        return answer;
    }

    public String getName() {
        return myName;
    }

    public void printInfo() {
        String response;
        response = "Hello, my name is " + myName;
        response = response + " and I'm " + myAge + " years old!";
        System.out.println(response);
    }

    public void increaseAge(int amount) {
        myAge = myAge + amount;
    }
    
    // Returns age in dog years (1 human year = 7 dog years)
    public int ageInDogYears () {
        return myAge * 7;
    }


    // Returns this Person's favorite color
    public String getFavoriteColor () {
        return myFavoriteColor;
    }


    // Prints this Person's name, age, and favorite color
    public void printInfo2() {
        String response = "My name is " + myName + " and I'm " + myAge + " years old. My favorite color is " + myFavoriteColor;
        System.out.println(response);
    }
    
    
    // Changes the state of this Person to sleeping
    public void sleep() {
        isSleeping = true;
    }


    // Changes the state of this Person to awake
    public void wakeUp() {
        isSleeping = false;
    }


    // Prints the sleep state of this Person
    public void printSleepState() {
        if (isSleeping == true)
            System.out.println("I am sleeping....zzzz....");
        else
            System.out.println("I am awake!");
    }
}
