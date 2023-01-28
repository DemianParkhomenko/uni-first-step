package PR5;
import static Labs.Colors.*;
import java.util.Arrays;

class Pz54 {
    public static void main(String[] args) {
        String[] students = { "Shevchenko", "Parkhomenko", "Rezenkov", "Messi", "Ronaldo", "Naumets", "Savchenko",
                "Gonchar", "Sinatra", "Armstrong", "Ronaldinho", "Petruciani", "Pupkov", "Lobok", "Nos", "Noga", "Ruka", "Kaka",
                "Bond", "Marcelo", "Carvajal", "Chan", "Ngu-en", "Mi-gua", "Mr.Barabash" };

        double[] results = new double[25];
        for (int i = 0; i < results.length; i++) {
            results[i] = (Math.random() * (15 - 12)) + 12;
        }
        double[] bestResults = bestResults(results);
        int[] indexOfBest= indexOfBest(results,bestResults);
        print(students,results,bestResults,indexOfBest);
    }

    public static double[] bestResults(double[] a) {
        double[] b = Arrays.copyOf(a, a.length);
        double[] res = new double[4];
        double changer;
        boolean isSorted=false;
        while (!isSorted){
            isSorted=true;
            for(int i= 0; i<a.length-1;i++){
                if(b[i]>b[i+1]){
                    isSorted=false;
                    changer=b[i];
                    b[i]=b[i+1];
                    b[i+1]=changer;
                }
            }
        }
        for (int i = b.length - 1, k = 0; k <= 3; i--, k++) {
            res[k] = b[i];
        }
        return res;
    }

    public static void print( String[] students, double[] result, double[] bestResults, int[] index) {
        for (int i = 0; i <= students.length - 1; i++) {
            System.out.printf("%d)%s -->%f\n", i, students[i], result[i]);
        }
        System.out.println(GREEN+"BESET RUNNERS"+RESET);
        for (int i = 0; i <= bestResults.length - 1; i++) {
            System.out.printf(YELLOW+"%d)%s -->%f\n"+RESET, index[i], students[index[i]], bestResults[i]);
        }
    }
    public static int[] indexOfBest(double[]results,double[]bestResults){
        int[] indexOfBest = new int[bestResults.length];
        double [] bestRes =Arrays.copyOf(bestResults,bestResults.length);
       int i =0,n=0;

        while (i<bestResults.length){
            for(int k =0 ;k<results.length;k++){
                if(bestRes[i]==results[k]){
                    indexOfBest[n]=k;
                n++;
                bestRes[i]=-1;
                }
            }
            i++;
        }
        return indexOfBest;
    }
}
