package My;
import static My.Colors.*;
import static java.lang.Math.*;
import static java.lang.Math.PI;

public class KR1 {
    public static void main(String[] args) {
        String str = "";double x=0;
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    str = "xxHxix";
                    x=0.4;
                    break;
                case 2:
                    str = "abxxxcd";
                    x=1.4;
                    break;
                case 3:
                    str = "xabcdx";
                    x=0.3;
                    break;
            }
            System.out.printf(GREEN+"\nВхідні дані завдання 1.%d:"+str+"-->Результати "+stringX(str)+RESET,i);
            System.out.printf(BLUE+"\nЗавдання 2.%d Вхідні:%.2f -->Результати:%.4f"  +RESET,i,x,calc(x));
        }

    }
    public static String stringX(String str) {
  for(int i=1;i<str.length()-1;i++){
      if(str.charAt(i)=='x'){
          str=str.substring(0,i)+str.substring(i+1,str.length());
          if(str.charAt(i)=='x')--i;
      }
  }
        return  str;
    }
    public static int factorial(int x){
        if (x <= 1){
            return 1;
        }else
            return (x * factorial(x-1));
    }
    public static double calc (double x){
        double sum = 0;
        for(int c = 1; c <= 6; c++){
            if(c == 5){
                continue;
            }
            sum += (pow(-1,c-1) * pow(x+1, c+2)) / (factorial(c-1) * tan(x));
        }
        return sum;
    }
}



