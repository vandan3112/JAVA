import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class GeometryPackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle c = new Circle(5);
		 System.out.println("Circle:");
	     System.out.println("Area: " + c.calArea());
	     System.out.println("Perimeter: " + c.calPerimeter());
	     
	     Rectangle r = new Rectangle(4, 7);
	     System.out.println("\nRectangle:");
	     System.out.println("Area: " + r.calArea());
	     System.out.println("Perimeter: " + r.calPerimeter());
	     
	     Triangle t = new Triangle(3, 4, 5);
	     System.out.println("\nTriangle:");
	     System.out.println("Area: " + t.calArea());
	     System.out.println("Perimeter: " + t.calPerimeter());
	}

}
