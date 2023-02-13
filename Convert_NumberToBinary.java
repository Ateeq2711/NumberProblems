package number;

import java.util.Scanner;

public class Convert_NumberToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String bin="";
		
		while(num>0) {
			int rem=num%2;
			bin=rem+bin;
			num=num/2;
		}
		System.out.println("Binary Number :"+ bin);
		
		
		//sort cut method
		//syso(Integer.toBinaryString(25))
	}
}
