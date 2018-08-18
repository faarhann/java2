import java.util.ArrayList;

public class ArrayListAvg {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

    public static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int lis: list){
            sum+=lis;
        }
        double average = sum/list.size();
        return average;
    }
}
