package shapes;

public class Shapestest {

    public static void main(String[] args){

        Rectangle newRectangle = new Rectangle(7,10);
        Square newSquare = new Square(4);

        System.out.println(newSquare.getArea());
        System.out.println(newSquare.getPerimeter());
        System.out.println(newRectangle.getArea());
        System.out.println(newRectangle.getPerimeter());
    }
}
