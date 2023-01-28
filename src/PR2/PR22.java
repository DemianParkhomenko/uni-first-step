package PR2;

import  java.util.Scanner;
public class PR22 {
    public static void main(String[] args) {
     System.out.println(nearHundred( ));
     System.out.println(nearHundred( ));
     System.out.println(nearHundred( ));
    }


    public static boolean  nearHundred( ){
        Scanner input = new Scanner(System.in);
        System.out.println("n=");
        int n = input.nextInt();
        if ( 90 < n && n < 100 ){
            return true ;
        } else if( 190 < n && n< 210 ) {
            return  true;
        }else {
            return false ;
        }
    }

}
