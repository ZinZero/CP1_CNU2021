package week10;

public class Circle {
	private double radius;
	
	public Circle() {	}
	public Circle(double radius) {	
		
	}
	
	public double getRadius() {		return radius;}
	public double getArea() {		return radius * radius * 3.14;}

}

public class Cylinder extends Circle{
	private static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println();
	}
	private double height;
	
	public Cylinder() {		}
	public Cylinder(double radius) {		}
	public Cylinder(double radius, double height) {		}
	
	public double getHeight() {		return height;}
	public double getVolume() {		return height * super.getArea();}
}
