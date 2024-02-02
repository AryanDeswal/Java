public class Practice_Set {
    public static void main(String[] args) {

        // Problem 1 & Problem 3
        System.out.println("Problem 1 & Problem 3");
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder Area: " + cylinder.calculateArea());
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        System.out.println();
        
        // Problem 2 & Problem 4
        System.out.println("Problem 2 & Problem 4");
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Cuboid cuboid = new Cuboid(5.0, 10.0, 15.0);
        System.out.println("Cuboid Area: " + cuboid.calculateArea());
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println();

        // Problem 5
        // The order of constructor execution in the given inheritance hierarchy is: 
        // Base class constructor -> Derived 1 class constructor -> Derived 2 class constructor.

    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }
}