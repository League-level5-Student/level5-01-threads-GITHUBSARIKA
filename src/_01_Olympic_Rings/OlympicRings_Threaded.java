package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot circleOne=new Robot();
	Robot circleTwo=new Robot();
	Robot circleThree=new Robot();
	Robot circleFour=new Robot();
	Robot circleFive=new Robot();

	circleOne.setSpeed(100);
	circleTwo.setSpeed(100);
	circleThree.setSpeed(100);
	circleFour.setSpeed(100);
	circleFive.setSpeed(100);
	circleOne.moveTo(600, 500);
	circleTwo.moveTo(400, 500);
	circleThree.moveTo(500,500);
	circleFour.moveTo(500, 400);
	circleFive.moveTo(400, 400);
	circleOne.penDown();
	circleTwo.penDown();
	circleThree.penDown();
	circleFour.penDown();
	circleFive.penDown();
	Thread cOne=new Thread(()-> {
		for (int i = 0; i < 360; i++) {
			
	        circleOne.move(1);          
	        circleOne.turn(1);
		}
		
	});
	Thread cTwo=new Thread(()->{
		for (int i = 0; i < 360; i++) {
		circleTwo.move(1);
		circleTwo.turn(1);
	}
	});
	Thread cThree=new Thread(()->{
		for (int i = 0; i < 360; i++) {
			circleThree.move(1);
			circleThree.turn(1);
		}
	});
	Thread cFour=new Thread(()->{
		for (int i = 0; i < 360; i++) {
			circleFour.move(1);
			circleFour.turn(1);
		}
	});
	Thread cFive=new Thread(()->{
		for (int i = 0; i < 360; i++) {
			circleFive.move(1);
			circleFive.turn(1);
		}
	});
	cOne.start();
	cTwo.start();
	cThree.start();
	cFour.start();
	cFive.start();
	try {
		cOne.join();
		cTwo.join();
		cThree.join();
		cFour.join();
		cFive.join();
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}}

