package Practice;

import java.util.Stack;

public class _40DecimalToHexaDecimalUseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2567;
		int rem=0;
		String str="";
		Stack<String> s=new Stack<>();
		char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(n>0) {
			rem=n%16;
			str=hex[rem]+str;
			System.out.println("pushed element: "+s.push(str));
			n=n/16;
			
		}
		System.out.println();
		while(!s.isEmpty()) {
			System.out.println("pop element: "+s.pop());
		}
			

	}

}
