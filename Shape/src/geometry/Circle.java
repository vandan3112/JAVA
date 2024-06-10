package geometry;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calArea() {
		return 3.14*radius*radius;
	}
	
	public double calPerimeter() {
		return 2*3.14*radius;
	}
}
