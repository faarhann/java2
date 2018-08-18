import java.util.Scanner;

public class ReverseText {

    public static String reverse(String text) {

        String reversed = "";
        int i = text.length() -1;
        while (i >= 0){
            reversed += text.charAt(i);
            i--;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.print("Type in your text: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
