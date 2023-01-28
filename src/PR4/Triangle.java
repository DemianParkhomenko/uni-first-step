package PR4;

public class Triangle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public String name;
    public double leg1;
    public double leg2;
    public double hypotenuse;


    public Triangle(String s ,double a ,double b) {
        name = s;
        if( a<0||b<0) {
            System.out.print("Impossible length");
        }else {
            leg1=a;
            leg2=b;
            hypotenuse=Math.sqrt(a*a+b*b);
        }

    }
public double TriangleSquareWithLegs(){
        System.out.printf(ANSI_YELLOW+"Square of %2$s = %1$,.2f\n"+ANSI_RESET,leg1* leg2/2,name);
        return leg1* leg2/2 ;
    }

    public  double TrianglePerimeter(){
        System.out.printf(ANSI_YELLOW+"Perimeter of %2$s = %1$.2f \n"+ANSI_RESET,leg1+ leg2+ hypotenuse,name);
            return leg1+ leg2+ hypotenuse;}

    public  boolean IsTriangleSimilarTo(Triangle t){
        boolean a = t.leg1 / leg1 == t.leg2 / leg2 && t.leg1 / leg1 == t.hypotenuse / hypotenuse;
        if(a==true){
            System.out.printf(ANSI_YELLOW+"%s and %s  are similar\n"+ANSI_RESET,name,t.name);
        }else{
            System.out.printf(ANSI_YELLOW+"%s and %s  are NOT similar\n"+ANSI_RESET,name,t.name);
        }
 return a;
}}
