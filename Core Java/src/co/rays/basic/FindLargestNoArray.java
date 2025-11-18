package co.rays.basic;

public class FindLargestNoArray {
	public static void main(String[]args) {
		int largestNo=0;
		int[] a = {5,10,15,20,25,30};
		for(int i=0;i<a.length;i++) {
			if(a[i]>largestNo) {
				largestNo=a[i];
				
				
			}
			
		}
		System.out.println(largestNo);
	}
}
