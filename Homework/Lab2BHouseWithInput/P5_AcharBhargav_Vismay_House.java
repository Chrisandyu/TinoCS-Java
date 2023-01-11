/*
 * Vismay Achar Bhargav
 * Intro Java
 * Lab 2b - HouseWithInput
 * Period 5
 * 1/11/23
 */
public class P5_AcharBhargav_Vismay_House {
    int numDoors;
    int numWindows;
    int numBedrooms;
    double askingPrice;
    
    public P5_AcharBhargav_Vismay_House(){
        numDoors = 10;
        numWindows = 8;
        numBedrooms = 3;
        askingPrice = 435000.0;
    }
    
    public P5_AcharBhargav_Vismay_House(int doors, int windows, int bedrooms, int askPrice){
        numDoors = doors;
        numWindows = windows;
        numBedrooms = bedrooms;
        askingPrice = askPrice;
    }
    
    public int getNumDoors(){
        return numDoors;
    }
    
    public int getNumWindows(){
        return numWindows;
    }
    
    public int getNumBedrooms(){
        return numBedrooms;
    }
    
    public double getAskingPrice(){
        return askingPrice;
    }
    
    public void setAskingPrice(int price){
        askingPrice = price;
    }
    
        /** Calculate and return the market value for this house
        Market value is $300,000 plus $55,000 per bedroom
        plus $3,000 per window */
    public double calculateMarketValue() {
        return 30000 + (55000 * numBedrooms) + (3000 * numWindows);
    }
    
    // Adds more windows to the house
    public void addWindows(int num) {
        numWindows += num;
    }
    
    // Adds more doors to the house
    public void addDoors(int num) {
        numDoors += num;
    }
    
    /** Adds more bedrooms to the house
        Each new bedroom adds one new door and one new window */
    public void addBedrooms(int num) {
        numBedrooms += num;
        numDoors += num;
        numWindows += num;
    }
    
    /** returns true if the asking price is less than the
        calculated market value and false otherwise */
    public boolean isBelowMarketValue() {
        if(askingPrice < calculateMarketValue()){
            return true;
        }
        return false;
    }
    
    /** returns a String specifying this house's
        - number of bedrooms
        - market value
        - asking price */
    public String toString() {
        String message = ("A " + numBedrooms + " house  with a market value of " + calculateMarketValue() 
                            + " is for sale with asking price " + askingPrice);
        return message;
    }
}