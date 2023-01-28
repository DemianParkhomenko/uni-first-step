package PZ6;
public class Pz6Ex2 {
    public static void main(String[] args) {
        String a ="1dsj2sdf3";
       System.out.println(sumDigits(a));
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}