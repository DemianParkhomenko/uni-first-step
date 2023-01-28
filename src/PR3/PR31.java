package PR3;

public class PR31 {
    public static void main (String[] args){
        int[] array1 = new int []{3,6,8} ;
        int[] array2 = new int[]{3,5,9};
        int[] array3 = middleWay(array1,array2);
        System.out.println(array3[0]);
        System.out.println(array3[1]);
    }
   public static int[]  middleWay(int[] a, int[] b){
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result ;
    }
}
