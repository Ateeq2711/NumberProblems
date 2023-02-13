package number;

import java.util.Scanner;

public class Fibonacci_Number {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	int k=1;
	int a=0;
	int b=0;
	
	for(int i=1;i<=n;i++) {
		a=b;
		b=k;
		k=a+b;
		System.out.print(a+" ");
	}
	
	
	}
}
