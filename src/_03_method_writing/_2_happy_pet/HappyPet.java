package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?(Type fish)");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.

		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "task", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk your pet", "Feed your pet", "Play catch with your pet?" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		
	

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	if(task==0) {
	JOptionPane.showMessageDialog(null, " Your pet likes to be walked, but is tired right now. Maybe later she wants to be walked. You lost 5 happines points.");
	task-=5;
	}
	else if(task==1) {
		JOptionPane.showMessageDialog(null, " Your pet was very hungry. You earned 20 happiness points.");
		task+=20;
	}
	else if(task==2) {
		JOptionPane.showMessageDialog(null, " Your pet does't like to play catch.You lost 10 happines points.");
		task-=10;
	}
	JOptionPane.showMessageDialog(null, task);
	
	
	if(task==50) {
		int something = JOptionPane.showMessageDialog(null, "You made your pet very happy. Do you want to play again?") "choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Yes", "No" }, null);
		}
		
		if(task==1) {
			
		}
		else if(task==2) {
			System.exit(task);
		}

}}