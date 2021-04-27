import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(addition(1, 2));
        System.out.println(subtraction(4, 2));
        System.out.println(multiplication(3, 2));
        System.out.println(division(10, 2));
        System.out.println(modulus(14, 5));
    }

    public static int addition(int add1, int add2){
        return add1 + add2;
    }

    public static int subtraction(int sub1, int sub2){
        return sub1 - sub2;
    }

    public static int multiplication(int mult1, int mult2){
        return mult1 * mult2;
    }

    public static int division(int div1, int div2){
        return div1 / div2;
    }
    public static int modulus(int mod1, int mod2){
        return mod1 % mod2;
    }

// BONUS
//    public static int multiplication2(int mul1, int mul2){
//        if ()
//    }

//    public static int

    public static int getInteger(int min, int max){

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger();
    }
}
