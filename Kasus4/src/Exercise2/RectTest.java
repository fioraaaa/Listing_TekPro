package Exercise2;

public class RectTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle 1: with Area: " +r1.getArea()+ " and Perimeter: " +r1.getPerimeter());
			
		Rectangle r2 = new Rectangle(3, 5);
		System.out.println("Rectangle 2: with Area: " +r2.getArea()+ " and Perimeter: " +r2.getPerimeter());
		
		Rectangle r3 = new Rectangle(7, 3, "blue", false);
		System.out.println("Rectangle 3: " +r3.toString());
			
		Rectangle r4 = new Rectangle();
		r4.setLength(6);
		r4.setWidth(9);
		System.out.println("Circle 4: the length is: " +r4.getLength()+ " the width is: " +r4.getWidth());
	}
}
