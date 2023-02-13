package number;

import java.util.Scanner;

public class Disarium_number {
	
	//135=1^1 +3^2 +5^3
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int cop=num;
		int sum=0;
		int rem=0;
		int digit=Integer.toString(num).length();		
		while(cop>0) {
			rem=cop%10;
			sum=(int) (sum+Math.pow(rem, digit));
			digit--;
			cop=cop/10;
		}
		if(num==sum) {
			System.out.println(num+" is Disarium_number");
		}else{
			System.out.println(num+" is not Disarium_number");
		}
	}

}
