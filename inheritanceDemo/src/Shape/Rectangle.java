package Shape;

public class Rectangle {
	private double length;
    private double breadth;
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }
    
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}
