public class Practice_Set3 {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem 1");
        String inputString1 = "Convert Me To Lowercase";
        String modifiedString1 = inputString1.toLowerCase();
        System.out.println("Original String: " + inputString1);
        System.out.println("Modified String: " + modifiedString1);

        // Problem 2
        System.out.println("Problem 2");
        String inputString2 = "Replace spaces with underscores";
        String modifiedString2 = inputString2.replace(' ', '_');
        System.out.println("Original String: " + inputString2);
        System.out.println("Modified String: " + modifiedString2);

        // Problem 3
        System.out.println("Problem 3");
        String inputString3 = "Dear <|name|>, Thanks a lot!";
        String modifiedString3 = inputString3.replace("<|name|>", "Aryan");
        System.out.println("Original String: " + inputString3);
        System.out.println("Modified String: " + modifiedString3);

        // Problem 4
        System.out.println("Problem 4");
        String inputString4 = "This string contains  double and   triple spaces";
        System.out.println("Index of double spaces: "+inputString4.indexOf("  "));
        System.out.println("Index of triple spaces: "+inputString4.indexOf("   "));

        // Problem 5
        System.out.println("Problem 5");
        String letter = "Dear Harry,\n\n\tThis Java Course is nice.\n\nThanks";
        System.out.println(letter);
    }
}