package PR3;

import java.util.ArrayList;

public class PR33 {
    public static void main (String[] args){

int[]a = new int[]{2,0,2};
int[]b = new int[]{3,4,5,6,1,100};
int resA = countEvens(a);
int resB = countEvens(b);
System.out.println(resA +"  "+ resB);
    }


    public static int countEvens (int[] array){
      int i;
        ArrayList<String> count = new ArrayList<>();

      for( i = 0 ;i <= array.length -1; i++) {
            if(array[i]%2 == 0){
                count.add("1");
            }
      }
        return count.size();
    }
}
