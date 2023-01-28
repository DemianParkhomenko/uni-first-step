package PR2;

public class PR25 {
    public static void main(String[] args) {

int a = (int) (Math.random()*20);
int b =  (int)(Math.random()*20);


System.out.printf("Случайное личсло 1 =  %d\n",a );
System.out.printf("Случайное личсло 2 =  %d\n",b );
close10(a,b);
}
public static int close10(int A , int B ){
    if( Math.abs(10 - A)>Math.abs(10-B)){
       System.out.println(B);
    }else if (Math.abs(10 - B)>Math.abs(10-A)){
        System.out.println(A);
    }else if (Math.abs(10 - A)==Math.abs(10-B)){
        System.out.println("0");
        }
    return A;
}



}
