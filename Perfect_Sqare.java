package number;

import java.util.Scanner;

public class Perfect_Sqare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i=1;i<=num/2;i++) {
			if(i*i==num) {
				System.out.println("The Number is Square of :"+i);
			}
		}
	}

}
