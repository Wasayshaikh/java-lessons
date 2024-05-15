import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListLesson {
    public  static void  main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(6);
        System.out.println("Adding value to array List and printing it");
        System.out.println(numbers.toString());
        System.out.println("Adding value to array List and printing it");
        System.out.println("Sorting Array List Ascending order");
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());
        System.out.println("Sorting Array List Descending order");
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        System.out.println("Getting Array List Size");
        System.out.println(numbers.size());

        System.out.println("Checking if Array List contain the value both true false");
        System.out.println(numbers.contains(Integer.valueOf(5)));
        System.out.println(numbers.contains(Integer.valueOf(10)));

        System.out.println("Changing the value from ArrayList using index key");
        System.out.println(numbers.set(5, Integer.valueOf(15)));
        System.out.println("Now Array List become now");
        System.out.println(numbers.toString());

        System.out.println("Removing value from array list using index value");
        numbers.remove(2);
        System.out.println("Now Array List become now");
        System.out.println(numbers.toString());

        System.out.println("Removing value from array list using value");
        numbers.remove(Integer.valueOf(15));
        System.out.println("Now Array List become now");
        System.out.println(numbers.toString());

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        numbers2.add(7);
        numbers2.add(6);
        numbers2.add(3);
        numbers2.add(2);

        numbers3.add(7);
        numbers3.add(6);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(7);

        System.out.println("Array List COmparing two Array List both true and false");
        System.out.println(numbers.equals(numbers2));
        System.out.println(numbers.equals(numbers3));
        System.out.println("Compression only work when the array matches the values on same indexes");




    }
}
