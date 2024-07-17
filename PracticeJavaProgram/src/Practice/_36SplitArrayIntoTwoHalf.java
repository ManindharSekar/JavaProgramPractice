package Practice;

public class _36SplitArrayIntoTwoHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,8,10,12,14,16};
		int b[]=new int[4];
		int c[]=new int[4];
		int j=0;
		
		for(int i=0;i<a.length;i++) {
			if(i<4) {
				b[i]=a[i];
			}else {
				c[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
