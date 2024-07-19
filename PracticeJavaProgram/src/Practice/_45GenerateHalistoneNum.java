package Practice;

import java.util.Scanner;

public class _45GenerateHalistoneNum {
	
	public static void meth(int num) {
		int a,b;
		
		if(num<=0) {
			System.out.println("invalid number");
		}
		if(num==1) {
			return;
			
		}
		
		if(num%2!=0) {						
			a=3*num+1;                    /*For Even  N = N / 2    								
			System.out.println(a);        For Odd N = 3 * N + 1 */
			meth(a);
		}else {
			b=num/2;
			System.out.println(b);
			meth(b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		meth(n);

	}

}
