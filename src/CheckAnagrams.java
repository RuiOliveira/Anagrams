import java.util.Arrays;

/**
 * @author      Rui Oliveira <rui18oliver@gmail.com>
 * @Section 1
 * Question 2
 */

public class CheckAnagrams {

    /**
     * @Description: Call CheckAnagram and print the results in log
     */
    public static void main(String[] args) {

        boolean result1 = CheckAnagram("Punishment","Nine Thumps");
        boolean result2 = CheckAnagram("The Morse code","Here come dots");
        boolean result3 = CheckAnagram("Snooze alarms","Alas! No more Zs");
        boolean result4 = CheckAnagram("Halley's Comet","Shall yet come");
        boolean result5 = CheckAnagram("One good turn deserves another.","Do rogues endorse that? No,never!");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);



    }

    /**
     * @Description: The obbjectve of this method is convert, clear all with spaces (I use a regular expression) from the two input
     * strings and create a character array then I compare the two character arrays and I print return a boolean
     * */
    public static boolean CheckAnagram(String firstWord, String secondWord) {

        firstWord.toLowerCase();
        secondWord.toLowerCase();

        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }

}
