package co.rays.basic;

public class ReverseNum {
	public static void main(String[]args) {
		int i=123;
		int r=0;
		int reversNo=0;
		
		while(i>0) {
			r=i%10;
			reversNo=(reversNo*10)+r;
			i=i/10;
		}
		System.out.println(reversNo);	
	}

}
