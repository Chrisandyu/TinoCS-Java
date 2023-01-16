import java.awt.Point;
public class P5_AcharBhargav_Vismay_Pen {
    public static String defaultColor = "Black";
    public int penWidth;
    public static final int DEFAULT_PEN_WIDTH = 1;
    
    public Point position;
    private String penColor;
    
    public P5_AcharBhargav_Vismay_Pen(){
        penColor = defaultColor;
        penWidth = DEFAULT_PEN_WIDTH;
        position = new Point(0, 0);
        
    }
    
    public P5_AcharBhargav_Vismay_Pen(int width){
        penWidth = width;
        penColor = defaultColor;
        position = new Point(0, 0);
    }
    
    public P5_AcharBhargav_Vismay_Pen(int width, String color){
        penWidth = width;
        penColor = color;
        position = new Point(0, 0);
    }
    
    public static void printsDefault(){
        System.out.println("Default Color: " + defaultColor + ", Default Width: " + DEFAULT_PEN_WIDTH);
        for(int i = 0; i < 100; i++){
        
        }
    }
    
    public String getPenColor() {
                                    return penColor;
                                }
    
    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }                                                                                                   
                                                                        
}