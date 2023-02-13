package number;

public class Armstrong_Number {
	
	//153=1*1*1+5*5*5+3*3*3
	
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int rem;
		int sum=0;
		
		while (temp>0) {
			rem=temp%10;
			temp=temp/10;
			sum=sum+rem*rem*rem;
		}
		
		if(sum==num) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
			
	}

}
