import java.util.Objects;

/**
 * @author      Rui Oliveira <rui18oliver@gmail.com>
 * @Section 1
 * Question 2
 */

public class Main {

    /**
     * @Description: Call fixSpelling and print the results in log
     */

    public static void main(String[] args) {
        System.out.println(fixSpelling("hostleworld"));
    }

    /**
     * @Description: In java "==" operator checks whether the references to objects are equal (memory positions).
     * string.equals() function checks the actual contents of a string
     */

    public static String fixSpelling(String name) {

        String wordToCheck = new String(name);

        //if(wordToCheck == "hostleworld" ) (ERROR!)

        if(Objects.equals(wordToCheck, "hostleworld")) {
            name = "hostelworld";
        }
        else {
            fixSpelling(name);
        }
        return name;
    }
}

