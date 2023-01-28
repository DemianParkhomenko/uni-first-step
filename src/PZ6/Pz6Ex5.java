package PZ6;
public class Pz6Ex5 {

    public static void main(String[] args) {
        String a ="hello world!";
        String b ="hello world!";
        System.out.println(withoutString(a,b));
    }
    public static String withoutString(String base, String remove) {
        String temp;
        String res = base;
        if(base.length()==remove.length())
            res="";
        for (int i = 0; i < base.length() - remove.length(); i++) {

            temp = base.substring(i, i + remove.length());

            if (temp.equalsIgnoreCase(remove)) {
                res = base.replace(temp, "");
            }
        }
        return res;
    }
}
