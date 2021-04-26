import javax.lang.model.SourceVersion;

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

        for (int i = 1; i <= 100; i += 1){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Fizzbuzz");
            } else if (i % 3 == 0){
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0){
                System.out.println(i + " Buzz");
            }
        }

    }
}
