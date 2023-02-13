package number;

import java.util.Scanner;

public class Convert_NumberToOcata {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String bin="";
		
		while(num>0) {
			int rem=num%8;
			bin=rem+bin;
			num=num/8;
		}
		System.out.println("Octa Number :"+ bin);
	}
}
