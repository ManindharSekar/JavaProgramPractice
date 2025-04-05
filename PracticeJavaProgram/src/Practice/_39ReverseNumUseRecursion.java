package Practice;

public class _39ReverseNumUseRecursion {
	
	public static void reverse(int n) {
		if(n<10) {
			System.out.println(n);
			return;
		}else {
			System.out.print(n%10);
			reverse(n/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		System.out.print("reverse of number is=");
		reverse(num);

	}

}
