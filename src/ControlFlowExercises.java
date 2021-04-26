import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

        //while
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

        //do while
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        for(int i=5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for(int i=100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i += 1){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + " Fizzbuzz");
//            } else if (i % 3 == 0){
//                System.out.println(i + " Fizz");
//            } else if (i % 5 == 0){
//                System.out.println(i + " Buzz");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int userInput = scanner.nextInt();
//        System.out.println("Here's your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------------------------");
//
//        for (int i = 1; i <= userInput; i++){
//            int squared = i*i;
//            int cubed = i*i*i;
//            System.out.printf("%d | %d | %d \n", i, squared, cubed);
//        }

        System.out.println("What grade did you get this semester?");
        int userInput = scanner.nextInt();

        for (int i = 0; i <= userInput; i++) {
            if (userInput < 59){
                System.out.println("You've received an F.");
                break;
            } else if (userInput >= 60 && userInput <= 66) {
                System.out.println("You've received a D.");
                break;
            } else if (userInput >= 67 && userInput <= 79){
                System.out.println("You've received a C.");
                break;
            } else if (userInput >= 80 && userInput <= 87){
                System.out.println("You've received a B.");
                break;
            } else if (userInput >= 88 && userInput <= 98) {
                System.out.println("You've received a A.");
                break;
            } else if (userInput >= 99){
                System.out.println("You've received a A+.");
                break;
            }
        }
    }
}

