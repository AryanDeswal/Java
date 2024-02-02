package myPackages.accessPackage1;

import myPackages.accessPackage2.ParentClass;

public class ChildClass extends ParentClass {
    public void method1() {
        ChildClass child = new ChildClass();

        // Accessing default property from the same package is allowed
        // System.out.println("Default Property (from subclass): " +
        // child.defaultProperty);
        System.out.println("Default Property (from subclass): " + "Giving Error");

        // Accessing protected property from the subclass is allowed
        System.out.println("Protected Property (from subclass): " + child.protectedProperty);
    }
}