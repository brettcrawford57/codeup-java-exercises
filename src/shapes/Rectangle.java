package shapes;

public class Rectangle {

    protected int length;

    protected int width;


    public Rectangle(int width, int length){

        this.width = width;

        this.length = length;

    }

    public int getPerimeter(){
        return (width * 2) + (length * 2);
    }

    public int getArea(){
        return width * length;
    }

}
