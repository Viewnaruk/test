package lab02;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter hight(cm):");
		float hight = scan.nextFloat();
		float hightm=hight/100;
		System.out.print("Enter weight(kg):");
		float weight = scan.nextFloat();
		float result = weight/(hightm*hightm);
		System.out.printf("Your BMI is %.4f",result);
		if (result < 18.5 ) {
			System.out.println ("(Underweight)");
		}
		else if (result >= 18.5 && result <= 24.9) {
			System.out.println ("(Healthy Weight)");
		}
		else if (result >= 25.0 && result <= 29.9) {
			System.out.println ("(Overweight)");
		}
		else if (result >=30.0) {
			System.out.println ("(Obesity)");
		}
		scan.close();
	}

}
