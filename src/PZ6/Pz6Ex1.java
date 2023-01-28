package PZ6;
import static My.Colors.*;
public class Pz6Ex1 {
    public static void main(String[] args) {
        String a ="We learn JAVA";
        String res="";
        for(int i=0;i<a.length();i++) {
            res = res + a.charAt(i) + a.charAt(i);
        }
        System.out.print(GREEN+a+"\n"+YELLOW+res+RESET);
    }



}


