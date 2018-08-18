import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {

    public static void main(String[] args){

        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");
        Collections.sort(brothers);

       removeLast(brothers);
       for (String brother: brothers){
           System.out.println(brother);
       }

    }

    public static void removeLast(ArrayList<String> list){

        if (list.size() > 0){
            list.remove(list.size() - 1);
        }
    }
}
