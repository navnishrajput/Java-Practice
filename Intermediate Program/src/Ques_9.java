import java.util.ArrayList;
import java.util.List;

public class Ques_9 {
    public static void main(String[] args) {
        System.out.println("--- Autoboxing ---");

        List<Integer> numberList = new ArrayList<>();
        numberList.add(25);
        numberList.add(75);
        System.out.println("Autoboxing with Collections:");
        System.out.println("ArrayList of Integers: " + numberList);

        System.out.println("+++++ Unboxing ---");

        int firstValue = numberList.get(0); // The Integer object is unboxed
        System.out.println("Unboxing from a collection: " + firstValue);

    }
}