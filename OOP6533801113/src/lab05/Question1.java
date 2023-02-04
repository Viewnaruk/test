package lab05;
import java.util.ArrayList;
public class Question1 {

	public static int[] sumArray(int[] num) {
		// TODO Auto-generated method stub
		int a[]=new int [] {0,0};
		int even=0;
		int odd=0;
		for(int i=0;i<num.length;i++) {
			if (i%2==0) {
				even=even+num[i];
				a[0]=even;	
			}
			else {
				odd=odd+num[i];
				a[1]=odd;
			}
		}
		return a;

	}
	public static void main(String[] args) {
		int[] num = new int[] {11,15,20,55,99};
		int[]  ans=sumArray(num);
		for (int i=0;i<ans.length;i++) {
			System.out.printf("Ans[%d]=%d\n",i,ans[i]);
		}
	
	}
}
