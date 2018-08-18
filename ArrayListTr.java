import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTr {

    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String wordInput = reader.nextLine();

        while (!wordInput.equals("")){
            words.add(wordInput);
            System.out.print("Enter a word: ");
            wordInput = reader.nextLine();
        }
        for (String wordsEntered: words){
            System.out.println("your inputs were: " + wordsEntered);
        }

        }

    }

