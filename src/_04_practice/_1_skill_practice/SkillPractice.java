package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		
			// Ask the user how many dimes they have

			String dimesString =JOptionPane.showInputDialog(null, "How many dimes do you have?");
			int dime = Integer.parseInt(dimesString);  

		// Tell them how many cents they have (hint multiply by 10)
		
		double money = dime*.10;

		JOptionPane.showMessageDialog(null, "You have $" +money);


		// Ask the user how tall they are (inches)
		String heightString =JOptionPane.showInputDialog(null, "How tall you you in inches?");
		int height = Integer.parseInt(heightString);  



		// If they are shorter than 36 inches, tell them to eat their Wheaties

		if(height<36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties");
		}


		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console


			for(int i=1;i<30;i++) {
				if(i%3==-0)  {
				System.out.println(i);
				
			}}




		}

		void skill3() { // Get a random number that is less than 20 and print it to the console

			Random gen=new Random();
			int num=gen.nextInt(20);
			System.out.println(num);

		// Get another random number that is less than 10 and print it to the console
			
			Random ten=new Random();
			int two=gen.nextInt(10);
			System.out.println(two);



		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
			
			System.out.println(num-two);


		}

		void skill4() { // In a pop-up, ask the user for the city they live in

			String city =JOptionPane.showInputDialog(null, "What city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City

			if(city.equals("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's Finest City");
			}

		// Otherwise, tell them to move to San Diego

			else {
				JOptionPane.showMessageDialog(null, "Move to San Diego");
			}

		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."

			String cars =JOptionPane.showInputDialog(null, "How many cars do you have?");

			if(cars.equals("0")) {
				JOptionPane.showMessageDialog(null, "I bet you use public transportation.");

			}
		// If there is 1 car, use a pop-up to display the make/model of the car

			else if(cars.equals("1")) {
				
				JOptionPane.showInputDialog(null, "What is the make/model of the car?");
				
			}

		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.

			
			else {
				JOptionPane.showInputDialog(null, "How many wheels does all the cars have together?");
			}

		}

		void skill5() { // In a pop-up, ask the user for the name of their school

			String school =JOptionPane.showInputDialog(null, "What school do you go to?");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.

			JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
}
}