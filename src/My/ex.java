package My;

public class ex {
    public static void main(String[] args) {
int[][] arr ={{1,2},{3,4}};

        System.out.printf("It`s your initial array\n");
        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++){
                System.out.printf("%d  ", arr[i][j]);
            }
            System.out.println();
        }
        interchange(2, arr);
        System.out.printf("It`s your result\n");
        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++){
                System.out.printf("%d  ", arr[i][j]);
            }
            System.out.println();
        }



    }


    public static void interchange(int size,int arr[][]){
        int p;
        for(int i=0,c=0;i<size&&c<2*size;i++){
            for(int j=0; j<size;j++,c++){
                p=arr[i][j];
                arr[i][j]=arr[size-1-j][size-1-i];
                arr[size-1-j][size-1-i]=p;
            }}
    }
}
