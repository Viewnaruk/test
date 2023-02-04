package lab03;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		for(;;) {
			System.out.println("Enter number of inpt[2-5]:");
			float x = scan.nextFloat();
			int max=0;
			float total=0;
			
				if (x >= 2 && x <=5) {
					for (int i = 0; i < x; i++) {
						System.out.printf("Enter number (integer) #%d:",i+1);
						int num = scan.nextInt();
						if (num > max) {
							max = num;
						}
						total += num;
					}
				System.out.printf("Max: %d\n",max);
				System.out.printf("Average: %.4f",total/x);
				break;
				}
				else {
					System.out.printf("Invalid! Please enter[2-5]");
				}
			
		}
			
	}

}
