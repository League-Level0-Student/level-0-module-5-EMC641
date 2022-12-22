package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel=0;
	static String pet;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int i=1;i<100;i++) {
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " + pet + " happy?", "task", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk your " +pet, "Feed your " +pet, "Play catch with your " + pet }, null);
		if(task==0) {	
			walk();
		}
		if(task==1) {
			food();
		}
		if(task==2) {
			playcatch();
		}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		if(happinessLevel>=50) {
		JOptionPane.showMessageDialog(null, "good job " +pet + " loves you");
		break;
		}
	  }
	}

	
	
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void walk() {
		JOptionPane.showMessageDialog(null, "Your " + pet +  " likes to be walked, but is tired right now. Maybe later your " + pet + " wants to be walked. You lost 5 happines points.");
		happinessLevel-=5;
	}
	
	static void food() {	
		JOptionPane.showMessageDialog(null, " Your " + pet + " was very hungry. You earned 20 happiness points.");
		happinessLevel+=20;
	}
	static void playcatch() {
		JOptionPane.showMessageDialog(null, " Your " + pet + " does't like to play catch.You lost 10 happines points.");
		happinessLevel-=10;
	}
	
	
	


}