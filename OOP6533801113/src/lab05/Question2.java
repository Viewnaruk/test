package lab05;
import java.util.ArrayList;
import java.util.Scanner;
public class Question2 {

	public static ArrayList find_lostnum(String[] Splittext1,String[] Splittext2) {
		// TODO Auto-generated method stub
		ArrayList lostnum=new ArrayList();
		for(int i=0;i<Splittext1.length;i++) {
			int check=0;
			for(int x=0;x<Splittext1.length;x++)
			if(Splittext1[i].equals(Splittext2[x])) {
				check = 1;
				break;
			}
			if(check==0) {
				lostnum.add(Splittext1[i]);
			}
		
		}
		return lostnum;
	}
	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.print("Enter 1st array:");
		String input1= get.nextLine();
		System.out.print("Enter 2st array:");
		String input2= get.nextLine();
		
		String[]Splittext1=input1.split(",");
		String[]Splittext2=input2.split(",");
		
		ArrayList ans =find_lostnum(Splittext1,Splittext2);
		System.out.print(ans);
	}
}
