package PR5;
import java.util.Arrays;
import java.util.Random;

public class PR52 {
public static void main(String[] args){
    int[][] arr=new int[4][4];
    Random random=new Random();
//System.out.println(arr.length);
   // System.out.println(arr[0].length);
    for(int i = 0;i<arr.length;i++){
       for (int j =0;i<arr[0].length-1;j++){
        arr[i][j]=(random.nextInt(10)-5);
       }
    }
    System.out.println(Arrays.deepToString(arr));
}
}
