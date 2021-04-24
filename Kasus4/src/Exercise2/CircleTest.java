package Exercise2;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Circle 1: " +c1.toString()+ " \nwith Area: " +c1.getArea()
		+ " and Perimeter: " +c1.getPerimeter());
			
		Circle c2 = new Circle(3.5);
		System.out.println("Circle 2: " +c2.toString()+ " \nwith Area: " +c2.getArea()
		+ " and Perimeter: " +c2.getPerimeter());
		
		Circle c3 = new Circle(7.0, "blue", false);
		System.out.println("Circle 3: " +c3.toString());
			
		Circle c4 = new Circle();
		c3.setRadius(14.0);
		System.out.println("Circle 4: ");
		System.out.println("the radius is: " +c4.getRadius());
	}
}
