package Exercise2;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println("Shape 1: " +s1.toString());
		
		Shape s2 = new Shape("blue", true);
		System.out.println("Shape 2: " +s2.toString());
		
		Shape s3 = new Shape();
		s3.setColor("purple");
		System.out.println("Shape 3: ");;
		System.out.println("the color is: " +s3.getColor());
		s3.setBoolean(false);
		System.out.println("is filled? " +s3.isFilled());
		System.out.println(s3.toString());
	}
}
