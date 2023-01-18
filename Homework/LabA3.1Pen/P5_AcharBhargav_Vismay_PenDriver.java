public class P5_AcharBhargav_Vismay_PenDriver{
    public static void main(String[] args){
        System.out.println("The default color for pens is " + P5_AcharBhargav_Vismay_Pen.defaultColor);
        P5_AcharBhargav_Vismay_Pen.defaultColor = "Blue";
        P5_AcharBhargav_Vismay_Pen.printDefaults();
        P5_AcharBhargav_Vismay_Pen pen = new P5_AcharBhargav_Vismay_Pen();
        System.out.println("pen width is " + pen.penWidth);
        int defPenWidth = P5_AcharBhargav_Vismay_Pen.DEFAULT_PEN_WIDTH;
        System.out.println("The default width of pens is " + defPenWidth);
        int xPos = (int) pen.position.getX();
        int yPos = (int) pen.position.getY();
        System.out.println("The pen is at " + "(" + xPos + ", " + yPos + ")");
        pen.position.setLocation(23, 0);
        System.out.println("Position is " + pen.position.toString());
        String locPenColor = pen.getPenColor();
        System.out.println("The pen color is " + locPenColor);
        pen.setPenColor("Green");
        System.out.println("The pen color is " + pen.getPenColor());
        P5_AcharBhargav_Vismay_Pen newPen = new P5_AcharBhargav_Vismay_Pen(3, "Pink");
        newPen.position.setLocation(9, 67);
        System.out.println(newPen.toString());
    }
}
