import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class CollectionsPractice {

    public static upperLastElement(ArrayList<String> strings) {
        for (String str : strings) {
            System.out.println(str.toUpperCase());
        }
    }

        public static void main (String[] args){

            ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin", "Douglas", "Kenneth"));

            System.out.println(names1.upperLastElement("Kenneth"));


    }
}