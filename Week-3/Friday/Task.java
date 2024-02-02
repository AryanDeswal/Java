import com.cwh.shape.Circle;
import com.cwh.shape.Cylinder;
import com.cwh.shape.Rectangle;
import com.cwh.shape.Sphere;
import com.cwh.shape.Square;

public class Task {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.calculateArea());

        Circle circle = new Circle(3);
        System.out.println("Circle Area: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        System.out.println("Cylinder Surface Area: " + cylinder.calculateSurfaceArea());

        Sphere sphere = new Sphere(4);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());
    }
}
