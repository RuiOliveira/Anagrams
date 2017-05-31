/**
 * Created by NB22440 on 01/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(fixSpelling("hostleworld"));
    }
    public static String fixSpelling(String name) {
        String wordToCheck = new String(name);
        if(wordToCheck == "hostleworld" ) {
            name = "hostelworld";
        }
        else {
            fixSpelling(name);
        }
        return name;
    }
}
