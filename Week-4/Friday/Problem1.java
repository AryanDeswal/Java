import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Problem 1:");
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("David");
        studentNames.add("Emma");
        studentNames.add("Frank");
        studentNames.add("Grace");
        studentNames.add("Hannah");
        studentNames.add("Isaac");
        studentNames.add("Jack");

        System.out.println("Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}