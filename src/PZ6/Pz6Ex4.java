package PZ6;

public class Pz6Ex4 {
    public static void main(String[] args) {
        String a = "asdasdfafdsfgcJAVA",b="JAvA";
        System.out.println(endOther(a,b));

    }
    public static boolean endOther(String a,String b) {
        if (a.length()<b.length()){
         System.out.println("Check your args");
        return false;
        }
        else
          return (a.substring( a.length()-b.length())).equalsIgnoreCase(b) ;
    }
}
