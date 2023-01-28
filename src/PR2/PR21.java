package PR2;

import java.util.Scanner;

public class PR21 {
    public static void main(String[] args) {
        diff21();
        diff21();
        diff21();
    }

    public static void diff21() {
        Scanner input = new Scanner(System.in);
        System.out.print("n =");
        double n = input.nextDouble();
        double m = 21 - n;
        if (n < 21) {
            System.out.println(m);
        } else if (n > 21) {
            System.out.println(m * -2);}
    }

}