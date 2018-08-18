import java.util.Scanner;

public class FirstPartOfStr {

    public static void main(String[] args){
        System.out.print("type a word: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        System.out.print("Length of the first part: ");
        int firstPart = Integer.parseInt(reader.nextLine());

        String result = text.substring(0, firstPart);
        System.out.println(result);
    }
}
