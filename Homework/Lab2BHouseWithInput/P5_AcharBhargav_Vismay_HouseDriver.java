import java.util.Scanner;

public class P5_AcharBhargav_Vismay_HouseDriver{
    public static void main(String[] args){
        P5_AcharBhargav_Vismay_House house = new P5_AcharBhargav_Vismay_House();
        System.out.println(house.toString());
        System.out.println("Doors: " + house.getNumDoors() 
                            + " Windows: " 
                            + house.getNumWindows() 
                            + " Bedrooms: " 
                            + house.getNumBedrooms() 
                            + " Asking Price: $" 
                            + house.getAskingPrice());
                            
        Scanner inputDoors = new Scanner(System.in);
        System.out.print("How many doors do you want? ");
        int userInputDoors = inputDoors.nextInt();
        
        Scanner inputWindows = new Scanner(System.in);
        System.out.print("How many windows do you want? ");
        int userInputWindows = inputWindows.nextInt();

        Scanner inputBedrooms = new Scanner(System.in);
        System.out.print("How many bedrooms do you want? ");
        int userInputBedrooms = inputBedrooms.nextInt();
        
        Scanner inputAskingPrice = new Scanner(System.in);
        System.out.print("What is your asking price? ");
        double userAskPrice = inputAskingPrice.nextInt();
        
        P5_AcharBhargav_Vismay_House userHouse;
        userHouse = new P5_AcharBhargav_Vismay_House(userInputDoors, userInputWindows, 
                                                    userInputBedrooms, userAskPrice);
        System.out.println(userHouse.toString());
        
        if(userHouse.isBelowMarketValue()){
            System.out.println("The asking price is below market value.");
        } else {
            System.out.println("The asking price is above market value.");
        }
        
        Scanner newAskingPrice = new Scanner(System.in);
        System.out.print("What is your new asking price? ");
        double newAskPrice = newAskingPrice.nextInt();
        userHouse.setAskingPrice(newAskPrice);
        
        System.out.println("After adding a bedroom:");
        userHouse.addBedrooms(1);
        System.out.println(userHouse.toString());
        if(userHouse.isBelowMarketValue()){
            System.out.println("The asking price is below market value.");
        } else {
            System.out.println("The asking price is above market value.");
        }
        
        
        
        
        
        
        
        
                                            
        
                                                     
        
        
        
    }
}