package lab06;

public class Circle {

	public double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		double oArea=0;
		oArea = 3.14*radius*this.radius;
		System.out.printf("\nArea %.2f",oArea);

	}
	public void calculateCircumference() {
		double ocum=0;
		ocum=2*3.14*this.radius;
		System.out.printf("\nCircumference; %.2f",ocum);
	}
		
		
		
	
	
	
	
}
