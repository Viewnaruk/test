package lab01;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of square(cm):");
		float num = scan.nextFloat();
		float x= num*num;
		System.out.printf("Square's Area is:"+x);
	}

}
