package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	
	int number1 =0;
	int number2 =1;
	
	
	for(int i=0; i<11; i++)  {
		int sum=number1+number2;
		System.out.println(sum);
		
		number1 = number2;
		number2= sum;
		
	}
}
}
