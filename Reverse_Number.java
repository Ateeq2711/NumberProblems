package number;

public class Reverse_Number {
	public static void main(String[] args) {
		int num=45678;
		
		//METHOD 1
		StringBuilder st=new StringBuilder();
		st.append(num);
		StringBuilder rev = st.reverse();	
		System.out.println("The reverse Number :"+rev);
	
		
		//METHOD 2
		int rev1=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			rev1=rev1*10+rem;
			num=num/10;
		}
			System.out.println(rev1);
	
	}

}
