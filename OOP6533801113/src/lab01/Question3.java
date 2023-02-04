package lab01;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter hight(cm):");
		float hight = scan.nextFloat();
		float hightm=hight/100;
		System.out.print("Enter weight(kg):");
		float weight = scan.nextFloat();
		float result=weight/(hightm*hightm);
		System.out.printf("Your BMI is %.2f",result);
	}

}
