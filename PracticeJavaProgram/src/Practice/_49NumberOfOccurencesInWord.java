package Practice;

import java.util.Scanner;

public class _49NumberOfOccurencesInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word in capital letters");
		Scanner n=new Scanner(System.in);
		String s=n.next();
		for(char i='A';i<='Z';i++) {
			int c=0;
			for(int j=0;j<s.length();j++) {
				if(i==s.charAt(j)) {
					c++;
				}
			}
			if(c>0) {
				System.out.println(i+"-"+c+" times");
			}
		}

	}

}
