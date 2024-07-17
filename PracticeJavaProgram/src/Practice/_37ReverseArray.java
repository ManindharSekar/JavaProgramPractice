package Practice;

public class _37ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		int i=0;
		int j=a.length-1;
		int temp;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println();
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
