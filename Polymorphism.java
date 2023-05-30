interface Shape
{
	double area();
	double perimeter();
}
class Rectangle implements Shape 
{
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double area() 
	{

		return length * breadth;
	}
	public double perimeter() 
	{
		return 2 * (length + breadth);
	}
}
class Circle implements Shape
{
	private double radius;

	public Circle(double radius) 
	{
		this.radius = radius;

	}
	public double area() 
	{

		return Math.PI * radius * radius;
	}
	public double perimeter() {

		return 2 * Math.PI * radius;
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double length = 6.0;
				double breadth = 7.0;
				Rectangle r = new Rectangle(length, breadth);
				System.out.println("Rectangle - Area: " + r.area());
				System.out.println("Rectangle - perimeter: " + r.perimeter());
				double radius = 2.0;
				Circle c = new Circle(radius);
				System.out.println("Circle - Area: " + c.area());
				System.out.println("Circle - perimeter: " + c.perimeter());
	}

}