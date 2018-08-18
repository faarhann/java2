import java.util.Scanner;

public class FirstThreeLet {

    public static void main(String[] args) {

        System.out.print("your name please");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        if (name.length() < 3) {

        } else {
            System.out.println("First char " + name.charAt(0));
            System.out.println("second char " + name.charAt(1));
            System.out.println("Third char " + name.charAt(2));
        }

    }
}
