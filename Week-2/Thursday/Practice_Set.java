public class Practice_Set {
    public static void main(String[] args) {

        // Problem 1
        System.out.println("Problem 1");
        Employee employee = new Employee();
        employee.setName("Aryan");
        employee.salary = 95000;
        System.out.println("Name of the Employee: " + employee.getName());
        System.out.println("Salary of the Employee: " + employee.getSalary());

        // Problem 2
        System.out.println("Problem 2");
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        // Problem 3
        System.out.println("Problem 3");
        Square square = new Square();
        square.side = 3;
        System.out.println("Area of the Square: " + square.area());
        System.out.println("Perimiter of the Square: " + square.perimeter());

        // Problem 4
        System.out.println("Problem 4");
        Rectangle rectangle = new Rectangle();
        rectangle.length = 3;
        rectangle.breadth = 4;
        System.out.println("Area of the Rectangle: " + rectangle.area());
        System.out.println("Perimiter of the Rectangle: " + rectangle.perimeter());

        // Problem 5
        System.out.println("Problem 5");
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

        // Problem 6
        System.out.println("Problem 6");
        Circle circle = new Circle();
        circle.radius = 3;
        System.out.println("Area of the Circle: " + circle.area());
        System.out.println("Perimiter of the Circle: " + circle.perimeter());
    }
}

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling employee...");
    }

}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Circle {
    int radius;

    public float area() {
        return 3.14f * radius * radius;
    }

    public float perimeter() {
        return 2 * 3.14f * radius;
    }
}

class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Tommy {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("Firing on the enemy");
    }
}