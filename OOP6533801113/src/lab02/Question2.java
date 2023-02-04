package lab02;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Salary:");
		int salary = scan.nextInt();
		int salayear=(salary*12)-100000;
		//System.out.println(salayear);
		if ( salayear <= 150000) {
			System.out.println("Your tax is exemption.");	
		}
		else if ( salayear >=150001 && salayear <= 300000) {			
			System.out.println("Tax rate is 5%");
			float result=(salayear*5)/100;
			System.out.printf("Your tax is %.1f bath",result);
			
		}
		else if ( salayear >=300001 && salayear <= 500000) {			
			System.out.println("Tax rate is 10%");
			float result=(salayear*10)/100;
			System.out.printf("Your tax is %.1f bath",result);
			
		}
		else if ( salayear >=500001 && salayear <= 750000) {			
			System.out.println("Tax rate is 15%");
			float result=(salayear*15)/100;
			System.out.printf("Your tax is %.1f bath",result);
			
		}
		else if ( salayear >=750001 && salayear <= 1000000) {			
			System.out.println("Tax rate is 20%");
			float result=(salayear*20)/100;
			System.out.printf("Your tax is %.1f bath",result);
			
		}
		else if ( salayear >=1000001 && salayear <= 2000000) {			
			System.out.println("Tax rate is 25%");
			float result=(salayear*25)/100;
			System.out.printf("Your tax is %.1f bath",result);
			
		}
		else if ( salayear >=2000001 && salayear <= 5000000) {			
			System.out.println("Tax rate is 30%");
			float result=(salayear*30)/100;
			System.out.printf("Your tax is %.1f bath",result);
			
		}
		else if ( salayear >=5000001) {			
			System.out.println("Tax rate is 35%");
			float result=(salayear*35)/100;
			System.out.printf("Your tax is %.1f bath",result);
			
		}
	}

}


