import java.lang.Math;

public class IsoRightTri{
    public int legLength;
    
    public IsoRightTri(){
        legLength = 4;
    }
    
    public IsoRightTri(int legLength){
        legLength = legLength;
    }
    
    public int getLegLength(){
        return legLength;
    }
    
    public void setLegLength(int length){
        legLength = length;
    }
    
    public double calculateArea(){
        return (legLength * legLength) / 2.0;
    }
    
    public double calcHyp(){
        return Math.sqrt(Math.pow(legLength, 2.0) + Math.pow(legLength, 2.0));
    }
    
    public double calcPerimeter(){
        return (legLength * 2) + calcHyp();
    }
    
    public void printTriangle(){
        int rows = 0;
        int count = legLength;
        for(int i = 0; i < legLength; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}