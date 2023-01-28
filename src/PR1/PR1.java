package PR1;

public class PR1 {

    public static void main(String[] args) {
        double ex1 = (20 / 3) + 158 * 158 ;
        double ex1_2 = Numb2() ;
        System.out.printf( "%1$,.1f %2$.1f",ex1, ex1_2) ;
    }


    public static double Numb2(){
    double n = 2.3253 ;
    return  Math.round( n) ;

    }

}
