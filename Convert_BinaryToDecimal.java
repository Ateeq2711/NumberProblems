package number;

import java.util.Scanner;

public class Convert_BinaryToDecimal {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		
		int decimal=Integer.parseInt(num, 2);
		
		System.out.println("Required Number is : " +decimal);
	}
}
