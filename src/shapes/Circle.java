package shapes;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args){

        Circle newCircle = new Circle();

        System.out.println("You have entered: " + newCircle.radius);
        System.out.println("This is your circumference: " + newCircle.circumference());
        System.out.println("This is your area: " + newCircle.getArea());

    }

    Scanner scanner = new Scanner(System.in);

    private double radius;

    public Circle(){

        System.out.println("Input radius");

        radius = scanner.nextInt();
    }

    public double circumference(){
        return (Math.PI * 2) * radius;
    }

    public double getArea(){

        return (Math.PI * Math.pow(radius, 2));
    }
}