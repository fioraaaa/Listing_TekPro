package Exercise2;

public class SquareTest {
	public static void main(String[] args) {
		Square sq1 = new Square(4);
		System.out.println("Square 1: with Area: " +sq1.getArea()+ " and Perimeter: " +sq1.getPerimeter());
		
		Square sq2 = new Square(7, "blue", false);
		System.out.println("Square 2: " +sq2.toString());
			
		Square sq3 = new Square(8);
		sq3.setLength(6);
		sq3.setWidth(6);
		System.out.println("Square 3: the length is: " +sq3.getLength()+ " the width is: " +sq3.getWidth());
	
		Square sq4 = new Square(5);
		sq4.setSide(3);
		System.out.println("Square 4: with side: " +sq4.getSide());
	}
}
