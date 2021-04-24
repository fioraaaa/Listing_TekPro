package Exercise1;

public class Cylinder extends Circle {
	private double height;

	// Constructor with default color, radius and height
	public Cylinder() {
		super(); // call superclass no-arg constructor Circle()
		height = 1.0;
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}

	// Constructor with default radius, color but given height
	public Cylinder(double radius, double height) {
		super(radius); // call superclass constructor Circle(r)
		this.height = height;
	}

	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	// A public method for retrieving the height
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return 2*Math.PI*getRadius()*height + 2*super.getArea();
	}
	
	// A public method for computing the volume of cylinder
	// use superclass method getArea() to get the base area
	public double getVolume() {
		return super.getArea() * height;
	}
	
	@Override
	public String toString() { //in Cylinder class
		return "Cylinder: subclass of" +super.toString() //use Circle's toString()
				+ ", height=" +height;
	}
}
