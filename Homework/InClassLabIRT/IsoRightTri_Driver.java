public class IsoRightTri_Driver{
    public static void main(String[] args){
        IsoRightTri tri = new IsoRightTri();
        tri.printTriangle();
        System.out.println(tri.getLegLength());
        tri.setLegLength(10);
        System.out.println("Leg Length: " + tri.getLegLength());
        System.out.println("Area: " + tri.calculateArea());
        System.out.println("Perimeter: " + tri.calcPerimeter());
        System.out.println("Hypotenous" + tri.calcHyp());
        tri.printTriangle();
    }
}