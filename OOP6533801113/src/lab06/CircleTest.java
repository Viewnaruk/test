package lab06;

//import java.util.Scanner;
public class CircleTest {

	public static void main(String[] args) {
		Circle radius=new Circle();
		radius.setRadius(15);
		
		
		System.out.printf("Radius: %.2f ",radius.getRadius());
		radius.calculateArea();
		radius.calculateCircumference();
		
	}

}
