package Labs;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Lr3
{
    public static void main( String[] args){
     //TASK 1
    task1(3.5,10.5,0.2);

    // TASK 2
    int[] arr1={-8,-1,0,2,-6,2,0,3,-4,0};
    int[] arr2={0,3,-5,9,2,0,0,0,0,0};
    int[] result = task2(arr1);//task 2 returns int[] --> int[0]==positives ; int[1]==zeros ; int[2]==negatives
    int[] result2 = task2(arr2);
    System.out.println("TASK 2");
        System.out.printf(YELLOW+ "Initial array"+Arrays.toString(arr1)+"\n Positive numbers : %d \nZeros: %d\nNegative numbers: %d\n",result[0],result[1],result[2]);
        System.out.printf("Initial array "+Arrays.toString(arr2)+" \nPositive numbers : %d \nZeros: %d\nNegative numbers: %d\n"+RESET,result2[0],result2[1],result2[2]);

        // TASK 3
        int i=1;
        while(i<=2){
        double resX1;//,resX2;
        System.out.print("Enter  data for task3: ");//0.6
        Scanner sc1=new Scanner(System.in);
        double x1 = sc1.nextDouble();
        resX1=task3(x1);
        System.out.printf(PURPLE+"TASK 3\nInitial data : %.2f --> Result: %,.4f\n"+RESET,x1,resX1);
        i++;
        }

    }
    public static void task1(double from,double to,double step){
        double y;
        double z;
        int i =0;
        for( double x = from ; from<=x&&x<=to  ; x+= step ){
            y=pow(E,(1/sqrt(x)))*sin(x);
            z=tan(sqrt(x))*sin(x-PI/2);
            System.out.printf(GREEN+"%d)"+CYAN+"  x = %.2f"+PURPLE + "  y = %.4f" +YELLOW+"  z = %.4f\n"+RESET,i,x,y,z);
            i++;
        }
    }

    public static int[] task2(int[]arr){
        int i =0;
        int positive = 0;
        int negative=0;
        int zeros=0;
        while(i<= arr.length-1){
            if(arr[i]>0){
                positive++ ;
            }else if(arr[i]<0){
                negative++ ;
            }else {
                zeros++ ;
            }
            i++;
        }

        return new int[]{positive, zeros, negative};
    }
    public static double task3 (double x){
        double res =0;
        int factorial=1;
        for(int k =1;k<=8;k++){
            factorial *= k ;
            res += (  pow(-1, k)*pow(x,2*k-1)  )  /  (  pow(2,k)*factorial  );
        }
        return res ;
    }
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
}

