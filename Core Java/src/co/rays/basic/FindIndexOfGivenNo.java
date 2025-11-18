package co.rays.basic;

public class FindIndexOfGivenNo {
	public static void main(String[]args) {
		int index = -1;
		int n=15;
		int[] a= {5,10,15,20,25,15};
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				index=i;
				System.out.println("Index of " +n +" is : " +index);
			}
			
		}
		if(index==-1) {
			System.out.println(index);
		}
		
	}

}
