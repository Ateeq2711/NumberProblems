package number;

public class count_number {
	public static void main(String[] args) {
		
	int num=56987;
	int count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}
		System.out.println("Number of digits: " +count);
	}
}
