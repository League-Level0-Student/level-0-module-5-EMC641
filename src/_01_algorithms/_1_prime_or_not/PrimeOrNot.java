package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
	String primenumberstring = JOptionPane.showInputDialog("Give me a number");
	int primenumber = Integer.parseInt(primenumberstring);  

	
   for(int i=2; i<primenumber; i++)  {
	   if(primenumber%i==0)  {
		   JOptionPane.showMessageDialog(null, "That number isn't prime.");

  }
	   
	   else {
		   JOptionPane.showMessageDialog(null, "That number is prime.");
	   }
	   
   }
	
	
	
}
}
