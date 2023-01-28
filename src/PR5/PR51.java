package PR5;
import java.util.Arrays;

public class PR51 {
    public static void main(String[] args){
int[] arr = new int[13];
for (int i =0;i<=arr.length-1;i++){
    arr[i]=(int)(Math.random()*1000-500);
    }
System.out.println(Arrays.toString(arr));
bubbleSort(arr);
System.out.println(Arrays.toString(arr));
    int[] arr2 = new int[]{1,3,5,7,9,11,13};
    isProgress(arr2);
        int[] arr3 = new int[]{1,3,5,-7,9,11,13};
        isProgress(arr3);
    }

public static void bubbleSort(int[] a){
int changer;boolean isSorted=false;
        while (!isSorted){
             isSorted=true;
            for(int i= 0; i<a.length-1;i++){
            if(a[i]>a[i+1]){
            isSorted=false;
            changer=a[i];
            a[i]=a[i+1];
            a[i+1]=changer;
            }
            }
        }
}
public static boolean isProgress(int[]a){
        boolean result = false;
        System.out.println(Arrays.toString(a));
        for(int i = 0;i<a.length-1;i++){
            if(a[i+1]-a[i]!=a[1]-a[0]){System.out.println("It`s NOT progression");
                return false;
            }else{
                result =true;
            }
        }
        if (result)
        System.out.println("It`s progression");


    return  result;}
}
