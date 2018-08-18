import java.util.ArrayList;
import java.util.Scanner;

public class RecuringWords {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true){
            System.out.print("enter a word: ");
            String wordInput = reader.nextLine();

            if (words.contains(wordInput)){
                System.out.println("You gave the word " + wordInput + " twice");
                break;
            }else {
                words.add(wordInput);
            }


        }
    }
}
