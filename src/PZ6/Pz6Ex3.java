package PZ6;

public class Pz6Ex3 {
    public static void main(String[] args) {
    String a ="cat21dog31dog2cat";
    System.out.println(catDog(a));
    }
 public static boolean catDog(String a){
        int cat=0,dog=0;
        for(int i=0;i<a.length()-2;i++){
            String temp=a.substring(i,i+3);
            if(temp.equals("cat")){
            cat++;
            }else if(temp.equals("dog")){
                dog++;
            }
        }
        return cat==dog;
 }
}
