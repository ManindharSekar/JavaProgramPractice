package Practice;

public class _22SortNumInAsscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,12,4,18,2,20,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		

	}

}
