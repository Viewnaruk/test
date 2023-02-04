package lab08;

public class Testvehicle {

	public static void main(String[] args) {
		vehicle c1 = new vehicle("bicycle",0, 0);
		System.out.println(c1);
		System.out.println("calDeteriorate="+c1.calDeteriorate(5));
		
		vehicle c2 = new vehicle("van",50000,0);
		System.out.println(c2);
		System.out.println("calDeteriorate="+c2.calDeteriorate(10));
		
		vehicle c3 = new vehicle("motercycle",25000,0);
		System.out.println(c3);
		System.out.println("calDeteriorate="+c3.calDeteriorate(15));
		
		Rentcar c4 = new Rentcar("Car", 200000, "Car01", 550);
		System.out.println(c4);
		Rentcar c5 = new Rentcar("Car", 500000, "Car02", 800);
		System.out.println(c5);
		System.out.printf("Rental cost of obj4 one week = %,d\n", c5.calcost());
		System.out.printf("Rental cost of obj4 ten days= %,d\n", c5.calcost(10));
		System.out.printf("Deteriorate of obj4 = %,.2f\n", c5.calDeteriorate(10));
	}

}
