package Practice;

public class _41FindLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,3,12,4,21,10,16};
		int smallest=a[0];
		int largest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("smallest number of array is: "+smallest);
		System.out.println("largest number of array is: "+largest);

	}

}
