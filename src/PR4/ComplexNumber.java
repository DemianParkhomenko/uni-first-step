package PR4;

public class ComplexNumber {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public double real;
    public double imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }


    public ComplexNumber(){
        this.real = 0;
        this.imaginary = 0;
        }


        public static double  complexModulus(ComplexNumber one){
        double result;
        result = Math.sqrt(one.real*one.real+one.imaginary*one.imaginary);
        System.out.printf(ANSI_PURPLE+"Result of modulus = %,.3f\n"+ANSI_RESET,result);
        return  result;
    }


    public static ComplexNumber  complexAdd(ComplexNumber one, ComplexNumber two){
        ComplexNumber result = new ComplexNumber();
        result.real = one.real + two.real;
        result.imaginary=one.imaginary + two.imaginary;
        System.out.printf(ANSI_PURPLE+"Result of adding = %,.3f +i * %,.3f\n"+ANSI_RESET,result.real,result.imaginary);
        return result;
    }


    public static ComplexNumber complexMultiple (ComplexNumber one, ComplexNumber two) {
        ComplexNumber result = new ComplexNumber();
        result.real=(one.real * two.real) - (one.imaginary * two.imaginary);
        result.imaginary=(one.real * two.imaginary)+(one.imaginary * two.real);
        System.out.printf(ANSI_PURPLE+"Result of complex = %.2f + i * %.2f\n"+ANSI_RESET,result.real,result.imaginary);
        return result;
    }


    public static ComplexNumber complexDivide(ComplexNumber one,ComplexNumber two) {
        ComplexNumber result = new ComplexNumber();
        result.real=(one.real*two.real+one.imaginary* two.imaginary)  /  (two.real*two.real+ two.imaginary* two.imaginary);
        result.imaginary = ( two.real* one.imaginary- one.real* two.imaginary) /(two.real*two.real+ two.imaginary* two.imaginary);
        System.out.printf(ANSI_PURPLE+"Result of dividing = %.2f + i * %.2f\n"+ANSI_RESET,result.real,result.imaginary);
        return  result;
          }


    public static double complexModulusOfSum(ComplexNumber one,ComplexNumber two){
        double result =complexModulus(complexAdd(one,two));
        return result;
    }
}
