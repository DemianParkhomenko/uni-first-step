package My;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {



     int[][]array=new int[3][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++){ Scanner in = new Scanner(System.in);
            System.out.print("Введіть число щоб заповнити масив: ");
            int num = in.nextInt();
                array[i][j] = num;
        }}


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " "); //виведення масиву
            }
            System.out.println();
        }
    }
}
