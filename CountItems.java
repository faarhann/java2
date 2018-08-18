import java.util.ArrayList;

public class CountItems {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("lol");
        list.add("second");
        list.add("third");
        int result = countItems(list);
        System.out.println(result);

    }

    public static int countItems(ArrayList<String> list){
        System.out.println("There are this many items in the list: ");
        return list.size();
    }
}
