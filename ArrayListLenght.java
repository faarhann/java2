import java.util.ArrayList;

public class ArrayListLenght {
    public static void main(String[] args){


        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);


    }
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> returnInt = new ArrayList<Integer>();

        for (String lis: list){
            returnInt.add(lis.length());

        }
        return returnInt;

    }
}
