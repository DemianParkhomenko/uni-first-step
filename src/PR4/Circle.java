package PR4;
import java.lang.Math;

public class Circle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public String name;
    public double centerX;
    public double centerY;
    public double pointX  ;
    public double pointY  ;
    public double radius ;

    public Circle(String s,double x1 ,double y1,double r) {
        name = s;
        centerX= x1  ;
        centerY =  y1  ;
        radius =Math.abs(r);}

public  double squareRadius(){
System.out.printf(ANSI_GREEN+"Square of %s = %.2f\n"+ANSI_RESET,name,Math.PI *  radius *  radius);
    return Math.PI *  radius *  radius;}

public  void haveEqualSquares(Circle c){
        if(c.radius == radius){
            System.out.printf(ANSI_GREEN+"Squares of %s and %s are equal\n"+ANSI_RESET,name,c.name);
}else{
        System.out.printf(ANSI_GREEN+"Squares of %s and %s are NOT equal\n"+ANSI_RESET,name,c.name);
    }
}}

