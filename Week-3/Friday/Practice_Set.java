import java.util.Scanner;

import myPackages.accessPackage1.ChildClass;
import myPackages.calculatorPackage.*;
import myPackages.folder.MyClass;
import myPackages.folder.folderL1.MyClassL1;
import myPackages.folder.folderL1.folderL2.MyClassL2;

public class Practice_Set {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem 1");
        Calculator basicCalc = new Calculator();
        ScientificCalculator sciCalc = new ScientificCalculator();
        HybridCalculator hybridCalc = new HybridCalculator();
        System.out.println("Calculator: " + basicCalc.add(5, 3));
        System.out.println("Scientific Calculator (Square Root): " + sciCalc.squareRoot(25));
        System.out.println("Hybrid Calculator (Power): " + hybridCalc.calculatePower(2, 3));
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        MyClass myClass = new MyClass();
        MyClassL1 myClassL1 = new MyClassL1();
        MyClassL2 myClassL2 = new MyClassL2();
        myClass.displayMessage();
        myClassL1.displayMessage();
        myClassL2.displayMessage();
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        ChildClass child = new ChildClass();
        child.method1();
        System.out.println();

        scanner.close();
    }
}