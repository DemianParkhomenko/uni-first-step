package Labs;

import  java.util.Scanner;
import java.util.Date;
import java.lang.Math;

public class Lr1 {
    public static void main(String[] args) {
        double a=1.5;
        double b=15.5;
        double x=-2.8;
        double S=calcS(a,b,x);
        double R=calcR(a,b,x);
        
        System.out.printf("a = %.4f\n",a);
        System.out.printf("b = %.4f\n",b);
        System.out.printf("x = %.4f\n",x);
        System.out.printf("R = %1.4f\n",R);
        System.out.printf("S = %1.4f\n",S);
        LookDate();

        Scanner sc = new Scanner(System.in);
        System.out.print(" a equal :");
        a = sc.nextDouble();
        System.out.print("b equal:");
        b = sc.nextDouble();
        System.out.print("x equal:");
        x = sc.nextDouble();
       double  R1=calcR(a,b,x);
        double S1=calcS(a,b,x);
        System.out.printf("R1 = %1.4f\n",R);
        System.out.printf("S1 = %1.4f\n",S);
        LookDate();
    }
    public static double calcR(double a, double b, double x) {
        return Math.sqrt(x*x+b)-Math.pow(b,2)*Math.pow(Math.sin(x+a),3)/x;
    }
    public static double calcS(double a, double b, double x) {
        return Math.pow(Math.cos(Math.pow(x,3)),2)-x/Math.sqrt(a*a+b*b);
    }
    public static void LookDate(){
        Date d = new Date();
        System.out.printf("%1$tA %1$tH:%1$tM:%1$tS \n", d);
    }

}


