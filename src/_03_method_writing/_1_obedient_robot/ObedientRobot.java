package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	static boolean drawSqauare() = false;

public static void main(String[] args) {
	
	static void drawSquare() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			rob.turn(90);
			rob.move(100);
		}
		
	

	
	
	
}
}
