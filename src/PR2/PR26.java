package PR2;

import java.util.Scanner;
public class PR26 {
    public static void main(String[] args) {

        int [] myArray = new int[1001];                       // Sorted Array of 1000
  for (int a = 0; a < myArray.length; a++) {
        myArray[a] = a + 1;}// цикл создания упорядоченного масива от 0 до 1000

        search(myArray);
}

public static int search (int[]array){
    int i = 0 ;
       int low = 0 ;
       int  high = array.length - 1 ;
       while (low <= high){
           i++;
           int middle = low +(high - low)/2;//middle formula

           Scanner sc = new Scanner(System.in);
           System.out.printf( "Attempt №%d. Is %d correct ?",i , middle);
           String m= sc.next();

           if(m.equals("smaller")){
               high=middle-1;// change range
           }else if (m.equals("bigger")){
               low = middle +1 ;//change range
           }else if(m.equals("correct"))  {
               System.out.println("Program won");
               return 0 ;
           }else{ System.out.println("wrong input");}
     }
    return -1;  }
}
