package number;

import java.util.Scanner;

//145
//1! +4! +5!= 145

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number"); 
	int num=sc.nextInt();
	int sum=0;
    int rem=0;
	
	int temp=num;
	
	while(num>0) {
		rem=num%10;
		int fact=1;
		 for(int i=1;i<=rem;i++) {
			 fact=fact*i;
		 }
		 sum=sum+fact;
		 num=num/10;
	}
	if(sum==temp) {
		System.out.println("Strong Number");
	}else {
		System.out.println("not Strong Number ");
	}
	
	
}
}
