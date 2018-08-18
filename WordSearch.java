import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args){
        System.out.print("Type in the first word: ");
        Scanner reader = new Scanner(System.in);
        String wordOne = reader.nextLine();

        System.out.print("type in the second word: ");
        String wordTwo = reader.nextLine();
        int check = wordOne.indexOf(wordTwo);

        if (check > 0){
            System.out.println("The word " + wordTwo + " is found in the word " + wordOne);

        }else{
            System.out.println("The word " + wordTwo + " is not found in " + wordOne);
        }
    }
}
