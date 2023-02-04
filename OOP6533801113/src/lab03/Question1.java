package lab03;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter integer:");
		int num = scan.nextInt();
		
		if (num <= 0) {
			System.out.println("Invalid input.");
		}
		
		else if (num >= 100 ) {
			System.out.println("Invalid input.");
		}
		
		else if (num >= 0 && num <= 99) {
			for (int i=1; i<=12 ; i++) {
				System.out.println( num+" x "+i+" = "+( num * i ) );
			}
		}
					
	}
	
}


