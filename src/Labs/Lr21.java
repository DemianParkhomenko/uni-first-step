package Labs;
import static java.lang.Math.* ;
public class Lr21 {
    public static void main (String[] args){
        double x1,x2,x3;
        x1 =-2.3 ;
        x2 = 0.6;
        x3 = 4.8;
        double resultx1=Lr21.task1(x1);
        double resultx2=Lr21.task1(x2);
        double resultx3=Lr21.task1(x3);
    System.out.printf("Розрахунок 1.1=%.4f\nРозрахунок 1.2=%.4f\nРозрахунок 1.3=%.4f\n",resultx1,resultx2,resultx3);

    //                !!!!task 2!!!!
        // double z1 = asin(Math.pow(x1,3)); z1 == NaN
        double z2= asin(pow(x2,3));
        //double z3 = Math.asin(Math.pow(x3,3));     z3== Nan
        //  double z4 = Math.acos(x1)*Math.acos(x1);  z4 == NaN
        double z5=acos(x2)*acos(x2);
        //double z6 = Math.acos(x3)*Math.acos(x3);  z6 ==NaN
        double z7 = tan(x1);
        double z8 =tan(x2);
        double z9 = tan(x3);


       double res1 = task2(z2,x2);
        double res2 =task2(z5,x2);
        double res3 =task2(z7,x1);
        double res4 =task2(z8,x2);
        double res5 =task2(z9,x3);
        System.out.printf("Розрахунок 2.1=%.4f\nРозрахунок 2.2=%.4f\nРозрахунок 2.3=%.4f\nРозрахунок 2.4=%.4f\nРозрахунок 2.5=%.4f\n",res1,res2,res3,res4,res5);


    }

public static double task1 (double x){
        double a = 2.3;
        double u =  sin((x+a));
        double y = 0;
System.out.printf(" Initial data a = %.4f x = %.4f y=%.4f u=%.4f\n",a,x,y,u);
     if (u<-0.5){
         return y = log(0.5*a-u)* log(0.5*a-u);
    }else if(-0.5<=u && u<=pow(10,-3)){
         return y=(2*x-a) / (7*PI+x+u);
    }else if(u>pow(10,-3)) {
         return y = log(u + x) - pow(E, x);
     }
     return 0;
}
public static double task2(double z,double x){
        System.out.printf("Initial data Z = %.4f X = %.4f\n",z, x);
    double y=asin(1000);
    if(z<-0.5){
         y = (2*z+1)*(2*z+1)/3.71-x*x;
    }else if (-0.5<=z&&z<=pow(10,-3)){
        y = pow(sin(z),3)-sin(z/3*PI );
    }else if (z>pow(10,-3) ){
  y = (  tan(z+x)-pow(E,x ) ) /3.5*x;
               }
return y ;
    }}