import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlphabeticalOrder {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Enter a word: ");
        String word = reader.nextLine();

        while (!word.equals("")){
            words.add(word);
            System.out.print("Enter a word: ");
            word = reader.nextLine();

            if (word.equals("")){
                Collections.sort(words);
                for (String order: words){
                    System.out.println("You typed the following words " + order);
                }
            }

        }
    }
}
