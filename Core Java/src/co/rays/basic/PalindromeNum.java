package co.rays.basic;

public class PalindromeNum {
	public static void main(String[]args) {
		int temp=121;
		int i=121;
		int r=0;
		int reversNo=0;
		
		while(i>0) {
			r=i%10;
			reversNo=(reversNo*10)+r;
			i=i/10;
		}
		if(temp==reversNo) {
			System.out.println("given number is palindrom");
		}
		else {
			System.out.println("number is not palindrome");
		}
		
	}
	

}
