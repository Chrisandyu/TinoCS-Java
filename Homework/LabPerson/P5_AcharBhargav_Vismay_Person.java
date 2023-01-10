
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

    public P5_AcharBhargav_Vismay_Person() {        
        myAge = 17;
        myHeight = 1.53;
        isFemale = true;
        myName = "Frances";
    }

    public P5_AcharBhargav_Vismay_Person(int age, double height, boolean female, String name) {
        myAge = age;
        myHeight = height;
        isFemale = female;
        myName = name;
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
}
