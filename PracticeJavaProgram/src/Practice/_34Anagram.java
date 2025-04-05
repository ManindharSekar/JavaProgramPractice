package Practice;

import java.util.Arrays;

public class _34Anagram {
	
	public static boolean isAnagram(String s1,String s2) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.toString(c1).equals(Arrays.toString(c2)))
		return true;
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		if(isAnagram(s1,s2)) {
			System.out.println("given string "+s1+" and "+s2+" are anagram");
		}else {
			System.out.println("given string "+s1+" and "+s2+" are not an anagram");
		}

	}

}
