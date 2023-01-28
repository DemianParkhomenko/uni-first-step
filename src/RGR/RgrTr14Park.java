package RGR;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
public class RgrTr14Park {
    public static void main(String[] args) {
        //TASK1
        double[][] arr = {
                {10, -5, -6, 10, -1, 78.3},
                {-2, -3, -8, 0, 7, -98.9},
                {3, 10, 8, -4, 1, 80},
                {-8, -10, 7, -9, -3, -126.7},
                {9, -5, -1, 7, -1, 72.6}};
        double[][] triangle = task1(arr);
        double[] result = task12(triangle);
        task13(arr,YELLOW+"Початкова");
        task13(triangle,GREEN+"Трикутна");
        task13(result);
        //TASK2
        System.out.println(YELLOW+"TASK2"+RESET);
        for(int i =1 ; i<=3;i++){
            System.out.print(BLUE+"Enter number(type Int): "+RESET);
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            boolean res=task2(a);
            if(res) {
                System.out.printf(GREEN+"Initial data: %d --> This number is a power of two"+RESET+"\n",a);
            }else {
                System.out.printf(GREEN+"Initial data: %d --> This number is"+YELLOW+ " NOT "+GREEN +"a power of two"+RESET+"\n",a);
            }
        }
    }

    public static double[][] task1(double[][] arr) {
         double[][] res = new double[arr.length][];
        for (int i = 0; i < arr.length; i++) {                         //глубокое копирование массива
            res[i] = Arrays.copyOf(arr[i], arr[i].length);
        }

        //цикл шахает  буквой "Г" вниз под главную диагональ
        for (int underI = 1, underJ = 0; underI <= res.length - 1 && underJ <= res[0].length - 1; underJ++, underI++) {
            int row = underI;
            //цикл перехода на следующий ряд
            while (row <= res.length - 1) {
                double multiplier = res[row][underJ] / res[underJ][underJ];                    //res[underJ][underJ] -элемент главной диагонали
                // цикл изменения элементов ряда                                                          //          DJ,DJ     0,1   0,2   0,3
                for (int j2 = 0; j2 <= res[0].length - 1 && row <= res.length - 1; j2++) {      //          DI,Dj  1,1   0,2   0,3
                        res[row][j2] -= res[underJ][j2] * multiplier;                                             //           0,1     0,1   2,2   0,3
                }                                                                                                                            //           0,1     0,1   3,2   3,3
                row++;
            }
        }
        //создание на едениц на главной диагонали
       for (int i=0;i<=res.length-1;i++){
          double multiplier =1/res[i][i];
           for (int j=0;j<=res[0].length-1;j++){
            res[i][j]=res[i][j]*multiplier;
           }
        }
        return res;
    }
    public static double[] task12(double[][] array) {
        double[] res = new double[array.length];
        for(int i = array.length - 1; i >= 0; i--){
            res[i] = array[i][array.length] / array[i][i];
            int c = array.length - 1;
            while(c > i){
                res[i] -= array[i][c] * res[c] / array[i][i];
                c--;
            }
        }
        return res;
    }

    public static void task13(double[][] array,String str) {
        System.out.printf("%s матриця\n"+RESET,str);
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[0].length - 1; j++) {

                if (array[i][j] == (int)array[i][j] || (Math.abs(array[i][j])-Math.abs((int)array[i][j]))<0.01) {
                    System.out.printf("%10d", (int) array[i][j]);
                } else
                    System.out.printf("%10.2f", array[i][j]);
            }
            System.out.print("\n");
        }
    }


    public static void task13(double[] array) {
        System.out.print(PURPLE+"Вектор результатів\n"+RESET);

        for (int i = 0; i <= array.length - 1; i++) {

            if (array[i] == (int)array[i]||(Math.abs(array[i])-Math.abs((int)array[i]))<0.01 ){
                System.out.printf("%d ", (int) array[i]);
            } else {
                System.out.printf("%.2f ", array[i]);
            }
        }
        System.out.println();
    }

    

    public static boolean task2(int n ){
        return n>0 && ((n&(n-1))==0);}
//      Для красоты : )
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

}







