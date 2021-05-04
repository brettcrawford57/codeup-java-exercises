public class ServerNameGenerator {

    public static void main(String[] args){

        String[] adjectives = {"high", "small", "red", "cold", "empty", "toxic", "confused", "blind", "sleepy", ""};
        String[] nouns = {"nebula", "television", "bottle", "fairy", "sword", "star", "box", "fighter", "comet", "meteor"};

        System.out.println("Here is your server name: " + element(adjectives) + "-" + element(nouns));
    }

    public static String element(String[] word){
        return word[(int) (Math.random() * (word.length-1))];
    }
}
