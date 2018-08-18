import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
    public static boolean palindrome(String text) {


        int i = text.length() - 1;
        String reversed = "";

        while (i >= 0){
            reversed += text.charAt(i);
            i--;
        }
        if (reversed.equals(text)){
            return true;
        }
        return false;


    }
}
