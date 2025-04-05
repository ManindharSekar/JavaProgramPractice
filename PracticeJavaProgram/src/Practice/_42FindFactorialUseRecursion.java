package Practice;

public class _42FindFactorialUseRecursion {
	
	public static int getFactorial(int num) {
		if(num==0) {
		return 1;
		}else{
			return num*getFactorial(num-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(getFactorial(n));

	}

}
