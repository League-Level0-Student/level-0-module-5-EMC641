package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
static Robot rob = new Robot();


public static void main(String[] args) {

String color = JOptionPane.showInputDialog("What color do you want to color the shape, red, blue, black, or white?");
	
	if(color.equals("red")) {
		rob.setPenColor(200,0,0);
}
	else if(color.equals("blue")) {
		rob.setPenColor(0,0,200);
	}
	else if(color.equals("black")) {
		rob.setPenColor(0,0,0);
	}
	else if(color.equals("white")) {
		}

	String shape = JOptionPane.showInputDialog("What shape do you want to be drawn, a circle, a square, or a triangle?");
	
	if(shape.equals("square")) {
		drawSquare();
	}
	else if(shape.equals("circle")) {
		drawCircle();
	}
	else if(shape.equals("triangle")) {
		drawTriangle();
	}

	

}



static void drawSquare() {
		
		rob.penDown();
		rob.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			rob.turn(90);
			rob.move(100);
		}
	 }
		
	 static void drawTriangle() {
			
			rob.penDown();
			rob.setSpeed(100);
			for (int i = 0; i < 3; i++) {
				rob.turn(120);
				rob.move(100);
			}
		}
	 
	 static void drawCircle() {
		
		 rob.penDown();
		 rob.setSpeed(100);
		 for(int i=0;i<360;i++) {
			 rob.turn(1);
			 rob.move(1);
		 }
	 }}
	
			
		
	


