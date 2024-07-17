package Practice;

public class _38CommonElementsInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,8,4,10,15,2,14};
		int b[]= {10,7,1,3,8,12};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
				
			}
		}

	}

}
