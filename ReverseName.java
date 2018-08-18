import java.util.Scanner;

public class ReverseName {

    public static void main(String[] args){
        System.out.print("please type in your name!");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        int i = name.length() -1;
        while (i >= 0){
            System.out.println(name.charAt(i));
            i--;
        }
    }
}
