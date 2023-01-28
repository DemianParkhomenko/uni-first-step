package PR3;

public class PR35 {
    public static void main (String[] args){
        int[] a = new int[]{0,5,0,7,0,0};
        int[] b = new int[]{3,3,6,0};
        int[] c = new int[]{3,5,6,7};
        zeroFront(a);
        zeroFront(b);
        zeroFront(c);
    }

    public static int[] zeroFront(int[] array) {
        int[] array2 = new int[array.length];
        int i2 = 0;

for(int i=0;i<=array.length-1;i++){
    if (array[i]==0) {
        array2[i2]=array[i];
        i2++;}}

for(int i=0;i<=array.length-1;i++){
            if (array[i]!=0) {
                array2[i2]=array[i];
                i2++;}}

        for(int count =0;count<=array2.length-1;count++){
            System.out.print(array2[count]+ " ");
            if(count==array2.length-1){
              System.out.println(" is your result");
            }
        }
return array2;}
    }


