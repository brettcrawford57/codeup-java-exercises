import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(addition(1, 2));
        System.out.println(subtraction(4, 2));
        System.out.println(multiplication(3, 2));
        System.out.println(division(10, 2));
        System.out.println(modulus(14, 5));
        System.out.println(getInteger(1, 50));
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

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput < max && userInput > min){
            System.out.println("This is your number " + userInput);
            return userInput;
        } else {
            System.out.println("Sorry, this number is invalid");
            return getInteger(min, max);
        }


    }
}
