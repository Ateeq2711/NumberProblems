package number;

public class Count_Even_odd_digit {
	public static void main(String[] args) {
		int num=456987;
		int countEven=0;
		int countOdd=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				countEven++;
			}else{
				countOdd++;
			}
			num=num/10;
		}
		
		System.out.println("Number of even digit: "+countEven);
		System.out.println("Number of odd digit: "+countOdd);
	}

}
