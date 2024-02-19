import java.util.HashSet;
import java.util.Set;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Problem 5:");

        Set<Integer> numberSet = new HashSet<>();

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(2);
        numberSet.add(4);
        numberSet.add(1);

        System.out.println("Elements in the set: " + numberSet);
    }
}