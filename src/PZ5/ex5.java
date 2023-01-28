package PZ5;

public class ex5 {
    public static void main(String[] args){
    int n=5,m=3;
    table(n,m);

}
    public static void table(int n,int m){
        int[][] res = new int[n][m];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                res[i][j]=i*j;
                System.out.printf("[%d][%d]=%d  ",i,j,res[i][j]);
            }
            System.out.println();
        }
    }
}
