package lab04;
import java.util.Scanner;
public class Question2 {

	public static void readnum(Double number) {
		// TODO Auto-generated method stub
		String text ="";
		String numeric = String.valueOf(number);
		for (int i=0; i<numeric.length();i++) {
			char readnumber = numeric.charAt(i);
			switch (readnumber) {
			case '1':
				System.out.print("one ");
				break;
			case '2':
				System.out.print("two ");
				break;
			case '3':
				System.out.print("three ");
				break;
			case '4':
				System.out.print("four ");
				break;
			case '5':
				System.out.print("five ");
				break;
			case '6':
				System.out.print("six ");
				break;
			case '7':
				System.out.print("saven ");
				break;
			case '8':
				System.out.print("eingth ");
				break;
			case '9':
				System.out.print("nine ");
				break;
			case '0':
				System.out.print("zero ");
				break;
			case '.':
				System.out.print("point ");
				break;
				
			}
		}
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		for(;;) {
		System.out.print("Enter real number[0,10]:");
		double numer = scan.nextDouble();
		if (numer>=0 && numer<=10) {
		readnum(numer);
		break;
		}
		else {
			continue;
		}
		}
	}

}
