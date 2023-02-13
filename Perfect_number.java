package number;

import java.util.Scanner;

//6=1+2+3
	//28=1+2+4+7+14
public class Perfect_number {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println("Number is perfect number");
		}else {
			System.out.println("Number is not perfect number");
		}
	}

}
