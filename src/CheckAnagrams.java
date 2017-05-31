import java.util.Arrays;

/**
 * Created by NB22440 on 31/05/2017.
 */
public class CheckAnagrams {

    public static void main(String[] args) {

        boolean result1 = isAnagram("Punishment","Nine Thumps");
        boolean result2 = isAnagram("The Morse code","Here come dots");
        boolean result3 = isAnagram("Snooze alarms","Alas! No more Zs");
        boolean result4 = isAnagram("Halley's Comet","Shall yet come");
        boolean result5 = isAnagram("One good turn deserves another.","Do rogues endorse that? No,never!");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);



    }

    public static boolean isAnagram(String firstWord, String secondWord) {

        firstWord.toLowerCase();
        secondWord.toLowerCase();

        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();



        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }

}
