
package PR4;

public class PR41 {

    public static void main(String[] args) {

//Task 1
        Circle kolobok = new Circle("kolobok", 0, 0, 12);
        Circle kolobok2 = new Circle("kolobok2", 3, 5, 11);
        Circle kolobok3 = new Circle("kolobok3", 3, 5, 11);

        kolobok.squareRadius();
        kolobok2.squareRadius();
        kolobok3.squareRadius();
        kolobok2.haveEqualSquares(kolobok3);
//Task 2
        Triangle triangle1 = new Triangle("triangle1", 3, 4);
        Triangle triangle2 = new Triangle("triangle2", 5, 6);

        triangle1.TrianglePerimeter();
        triangle1.TriangleSquareWithLegs();
        triangle1.IsTriangleSimilarTo(triangle2);


        //Task3
        ComplexNumber first = new ComplexNumber(1, 3);
        ComplexNumber second = new ComplexNumber(-1, 2);
        ComplexNumber.complexModulusOfSum(first,second);

        ComplexNumber.complexMultiple(first,second);
        ComplexNumber.complexDivide(first,second);
    }
}
