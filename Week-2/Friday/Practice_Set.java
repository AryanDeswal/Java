public class Practice_Set {

    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem 1");
        Cylinder myCylinder = new Cylinder(9, 12);
        System.out.println("Height of Cylinder: " + myCylinder.getHeight());
        myCylinder.setHeight(14);
        System.out.println("Updated Height of Cylinder: " + myCylinder.getHeight());

        // Problem 2
        System.out.println("Problem 2");
        System.out.println("Surface Area of Cylinder: " + myCylinder.surfaceArea());
        System.out.println("Volume of Cylinder: " + myCylinder.volume());

        // Problem 3
        System.out.println("Problem 3");
        Rectangle r = new Rectangle(12, 56);
        System.out.println("Length of Rectangle: " + r.getLength());
        System.out.println("Breadth of Rectangle: " + r.getBreadth());

        // Problem 4
        System.out.println("Problem 4");
        Sphere sphere = new Sphere(5);
        System.out.println("Surface Area of Sphere: " + sphere.surfaceArea());
        System.out.println("Volume of Sphere: " + sphere.volume());
    }
}

class Sphere {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return ((double) 4 / 3) * Math.PI * radius * radius * radius;
    }

}

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}