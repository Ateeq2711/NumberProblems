package number;

import java.util.Scanner;

//94
//9^2 +4^2=97
//9^2 +7^2=130
//1^2 +3^2 +0^2=10
//1^2  +0^2=1
//
//output 1 & 7 is Happy number


public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=0;
		int rem=1;
		
		while(num>9) {
			
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem);
				num=num/10;
			}
			num=sum;
			sum=0;
		}
		if(num==1 || num==7) {
			System.out.println("Happy number");
		}else {
			System.out.println("Not Happy number");
		}
		
		
	}

}
