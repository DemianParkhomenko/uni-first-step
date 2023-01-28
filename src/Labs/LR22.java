package Labs;
import static java.lang.Math.* ;
import  java.util.Scanner;
public class LR22 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print( "Write number of PI:");
         double a = sc1.nextDouble();

        Scanner sc11 = new Scanner(System.in);
        System.out.print( "Write denominator of the first angle in radians. Use \",\" for dividing and 3,14 for PI:");
        double a1 = sc11.nextDouble();
        double a2 =a*PI/a1;


        Scanner sc2 = new Scanner(System.in);
        System.out.print( "write number of PI:");
        double b = sc2.nextDouble();

        Scanner sc21 = new Scanner(System.in);
        System.out.print( "Write denominator of the first angle in radians. Use \",\" for dividing and 3,14 for PI:");
        double b1 = sc21.nextDouble();
        double b2=b*PI/b1;


        Scanner sc3 = new Scanner(System.in);
        System.out.print( "Write number of PI:");
        double c = sc3.nextDouble();
        Scanner sc31 = new Scanner(System.in);
        System.out.print( "Write denominator of the first angle in radians. Use \",\" for dividing and 3,14 for PI:");
        double c1 = sc31.nextDouble();
        double c2 = c*PI/c1;

       task3(a2);
       task3(b2);
       task3(c2);
        //task4
        System.out.println("Initial data:  8  ; 13.5  ; 1.1 ");
        task4(8,13.5,1.1);
        System.out.println("Initial data: 4  ; 3.56  ; 0.55");
        task4(3,3.56,0.55);
        System.out.println("Initial data: 1.9  ; 0.9  ; 0.9 ");
        task4(1.9,0.9,0.9);
    }
   public static void task3(double x){
        double tgx = tan(x);
double ctgx= 1/tgx;
if(ctgx>tgx){
    System.out.println("Cotangent is bigger");
}else if(tgx>ctgx){
    System.out.println("Tangent is bigger");
}
}
public static  void task4 (double a,double b,double c){
        if(a+b>=c&&a+c>=b&&b+c>=a){
            System.out.print("Triangle is possible\n");
        }else {
            System.out.print("Triangle is NOT possible\n");}

}
   }

