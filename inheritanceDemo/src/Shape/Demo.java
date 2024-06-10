package Shape;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setBreadth(5);
        System.out.println("Rectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();

        // Create an instance of Square
        Square square = new Square();
        square.setSide(4);
        System.out.println("Square:");
        square.printArea();
        square.printPerimeter();
    }
	}

