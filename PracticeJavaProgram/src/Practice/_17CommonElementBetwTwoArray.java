package Practice;

public class _17CommonElementBetwTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,3,55,23,11,20};
		int b[]= {40,10,22,11,20,4};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
