package PR3;
import java.util.ArrayList;

public class PR34 {
    public static void main (String[] args){
        int[] a = new int[]{3,5,3,7,4,3};
        int[] b = new int[]{3,3,6,3};
        int[] c = new int[]{3,5,6,7};
        boolean resA = haveThree(a);
        boolean resB = haveThree(b);
        boolean resC = haveThree(c);
        System.out.printf("First reslut = %b\nSecond result = %b\nThird result = %b" ,resA ,resB,resC );

    }

    public static boolean haveThree(int[] array) {

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0 ;i <= array.length-1 ;i++){
       if (i !=array.length-1 && i==0 && array[i] == 3  && array[i]!=array[ i+1]   ){
            result.add("element");
            }else if ( i !=array.length-1 && array[i] == 3  && array[i]!=array[ i+1] && array[i]!=array[ i-1]  ) {
           result.add("element");
       }else if (i ==array.length-1 && array[i] == 3  && array[i]!=array[ i-1]) {
           result.add("element");
       }
        }
if (result.size() == 3 ){
    return true;
}  else {
    return false ;
}}

}
