package Practice;

import java.util.Scanner;

public class _18PalindromeOrNot {
	
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		i++;
		j--;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=s.next();
		if(isPalindrome(str)) {
			System.out.println("Given String "+str+" is Palindrome");
		}else {
			System.out.println("Given String "+str+" is not a Palindrome");
		}
		

	}

}
