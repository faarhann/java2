import java.util.Scanner;

public class LastPartOfString {

    public static void main(String[] args){
        System.out.print("type a word: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        System.out.print("Length of the end part: ");
        int index = Integer.parseInt(reader.nextLine());

        String endPart = text.substring(text.length() - index);
        System.out.println(endPart);
    }
}
