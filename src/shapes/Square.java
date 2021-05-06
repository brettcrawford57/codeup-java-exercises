package shapes;

public class Square extends Rectangle{

    protected int side;


    public Square(int side) {

        super(side, side);

        this.side = side;
    }

    public int getArea(){
        return (int) side * side;
    }

    public int getPerimeter() {
        return side * 4;
    }
}
