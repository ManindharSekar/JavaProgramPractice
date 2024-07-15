package Practice;

import java.util.Scanner;

public class _19PrintNumbersInWords {
	public static void main(String[] args) {
		int digit1,digit2;
		String a[]= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
		String b[]= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		if(n<=-1||n>=101) {
			System.out.println("wrong input");
		}
		if(n>=1&&n<=19) {
			System.out.println(b[n]);
		}
		if(n>=20&&n<=100) {
			digit1=n/10;
			
			digit2=n%10;
			System.out.println(a[digit1]+" "+b[digit2]);
		}
	}

}
