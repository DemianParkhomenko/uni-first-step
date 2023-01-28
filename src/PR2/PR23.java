package PR2;

public class PR23 {
    public static void main(String[] args) {



System.out.println(sleepIn(false,true)  );
    }


    public static boolean sleepIn(boolean weekday , boolean vacation)
    {if (weekday== true && vacation==true ){
           return  true;
       }else if (weekday==false && vacation==true ){
           return true;
       }else if(weekday==false&&vacation==false){
           return true;
       }else {
           return false ;}


        }
    }
