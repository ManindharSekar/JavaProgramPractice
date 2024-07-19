package Practice;

import java.util.Stack;

public class _43ConvetDecimalToBinayUseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		int r;
		Stack<Integer> s=new Stack();
		while(n!=0) {
			r=n%2;
			s.push(r);
			n=n/2;
		}
		System.out.print(" binary is: ");
		while(!(s.isEmpty())) {
			System.out.print(s.pop());
		}

	}

}
