import java.util.Scanner;

public class SeperatingChar {


    public static void main(String[] args){
        System.out.print("Type in your name please: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        int i = 0;
        while (i < name.length()){
            System.out.println(name.charAt(i));
            i++;
        }
    }
    }
