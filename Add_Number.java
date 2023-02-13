package number;

public class Add_Number {
	public static void main(String[] args) {
		String num1="123";
		String num2="456";
		
		int sum=Integer.parseInt(num1)+Integer.parseInt(num2);//coverting String to Int
		System.out.println(sum);
		System.out.println(String.valueOf(sum));//convert int to String		
	}
}
