import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordering {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Enter a word: ");
        String word = reader.nextLine();


        while (!word.equals("")) {
            words.add(word);
            System.out.print("Enter a word: ");
            word = reader.nextLine();

            if (word.equals("")){
                Collections.reverse(words);
                for (String reversed: words){
                    System.out.println("words you entered in reverse " + reversed);
                }
            }

        }
        Collections.reverse(words);
        for (String regular: words) {
            System.out.println("You entered " + regular);
        }
    }


}