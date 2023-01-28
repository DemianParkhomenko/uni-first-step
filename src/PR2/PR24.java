package PR2;

import  java.util.Scanner ;

public class PR24 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Number1 =");
        int First= input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Number2 =");
        int Second = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Number3 =");
        int  Third = input1.nextInt();
System.out.println(isInRange(First,Second,Third));

    }
    public static boolean isInRange(int num1 ,int num2,int num3 ){
        if ( 13 <= num1&&num1<= 19 ||13 <= num2&&num2<= 19 ||13 <= num3&&num3 <= 19 ){
            return true;
        }else{
            return false;}

        }

    }

