package Practice;

import java.util.Arrays;

public class _23SortAndMergeArray {
	
	public static int[] merged(int[] arr1,int[] arr2) {
		int[] mergedArray=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length) {
			mergedArray[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			mergedArray[k]=arr2[j];
			j++;
			k++;
		}
		Arrays.sort(mergedArray);
		return mergedArray;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {10,4,6,20,31,2,5};
		int a2[]= {14,2,35,7,12,6};
		int[] mergedArray=merged(a1,a2);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(mergedArray));

	}

}
