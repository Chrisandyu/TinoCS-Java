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
    
    public static void printDefaults(){
        System.out.println("defaultColor is " + defaultColor + " and DEFAULT_WIDTH is " + DEFAULT_PEN_WIDTH);
    }
    
    public String getPenColor() {
        return penColor;
    }
    
    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }
    
    public void moveTo(int x, int y){
        position.setLocation(x, y);
    }
    
    public String toString(){
        return ("A " + penColor + " Pen of width " + penWidth + " located at (" +  Math.round(position.getX()) + ", " + Math.round(position.getY()) + ")");
    }
                                                                        
}