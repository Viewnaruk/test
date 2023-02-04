package lab04;
import java.util.Scanner;
public class Question1 {

	public static int countAEIOU(String text) {
		// TODO Auto-generated method stub
		int count=0;
		if (text.length()<=15) {
			String lowtext=text.toLowerCase();
		for(int i=0 ; i<lowtext.length();i++) {
			if ( lowtext.charAt(i)=='a'||lowtext.charAt(i)=='e'||lowtext.charAt(i)=='i'||lowtext.charAt(i)=='o'||lowtext.charAt(i)=='u')
				count++;
		}
	}
			return count;
}
	
	public static boolean checkLetter(String text) {
		for(int i=0;i<text.length();i++) {
			if (Character.isDigit(text.charAt(i))) {
				return false;
		}
	}
		return true;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter only text:");
		String lowtext = scan.nextLine();
		boolean checklet =checkLetter(lowtext);
		if(checklet==true&&lowtext.length()<=15) {
			int ans=countAEIOU(lowtext);
			System.out.printf("Input contains %d vowel",ans);
			
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
