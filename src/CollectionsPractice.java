import java.util.*;

public class CollectionsPractice {

//    public static upperLastElement(ArrayList<String> strings) {
//        for (String str : strings) {
//            System.out.println(str.toUpperCase());
//        }
//    }

        public static void main (String[] args){

//            ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin", "Douglas", "Kenneth"));
//
//            System.out.println(names1.upperLastElement("Kenneth"));

            Map<String, String> classMates = new HashMap<>();

                    classMates.put("Crawford", "Brett");
                    classMates.put("Howell", "Kenneth");
                    classMates.put("Adcock", "Nathan");

                    System.out.println(classMates);


            Map<String, List<String>> classMatesWithStuff = new HashMap<>();
            classMatesWithStuff.put("Shanshan",new ArrayList<>());
            classMatesWithStuff.put("Alex", new ArrayList<>());

            System.out.println(classMatesWithStuff);


        }
}