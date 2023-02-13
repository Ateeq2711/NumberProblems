package number;

import java.util.Scanner;

public class Sum_of_digit {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		
		System.out.println("Sum of the Digit :" + sum);
		
	}
}
