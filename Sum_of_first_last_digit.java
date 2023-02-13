package number;

import java.util.Scanner;

public class Sum_of_first_last_digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int lastNum=num%10;
		int firstNum=0;
		while(num>10) {
			num=num/10;
			firstNum=num;
		}
		System.out.println("Sum of First and Last digit :" +(lastNum+firstNum));
		
	}
}
