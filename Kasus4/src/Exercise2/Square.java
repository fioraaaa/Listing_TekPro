package Exercise2;

public class Square extends Rectangle {
	public Square(double side) {
		super(side, side); //Call superclass Rectangle(double,double)
	}
	
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(side);
	}
	
	@Override
	public double getArea() {
		return getSide()*getSide();
	}
	
	@Override
	public double getPerimeter() {
		return 4*getSide();
	}
	
	@Override
	public String toString() {
		return "A Square with side= " +getSide()+ ", which is a subclass of " +super.toString();
	}
}
