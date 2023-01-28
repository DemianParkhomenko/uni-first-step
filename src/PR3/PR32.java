package PR3;

public class PR32 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3 ,5};
        int[] array2 = new int[]{3, 0 ,2,5,7,3,4};
        int[] array3 = new int[]{2};
        int res1 = maxTriple(array1);
        int res2 = maxTriple(array2);
        int res3 = maxTriple(array3);
        System.out.printf("result1 = %d\nresult2 = %d\nresult3 = %d\n"  ,res1,res2,res3);
    }

    public static int maxTriple(int[] a) {
        int first = a[0];
        int middle = a[a.length / 2];
        int last = a[a.length - 1];
        if (first > middle && first > last || first == last){
            return first;
        } else if (middle > first && middle > last) {
            return middle;
        } else if (last > first && last > middle) {
            return last;
        }
        return 0;
    }


}//class end
