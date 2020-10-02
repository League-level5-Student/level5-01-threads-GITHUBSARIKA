package _02_Advanced_Robot_Race;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
          Robot[] robots=new Robot[5];
		//3. use a for loop to initialize the robots.
                 for (int i = 0; i < 5; i++) {
	                     robots[i]=new Robot();
	                     robots[i].moveTo( i * 100 + 300,500);
	                     
				}
                 boolean raceOver = false;
                 while(raceOver == false) {
                 for (int j = 0; j < robots.length; j++) {
                	
					Random random=new Random();
					int rand=random.nextInt(50);
					robots[j].move(rand);
					
					if(robots[j].getY()<=25) {
						raceOver=true;
						JOptionPane.showMessageDialog(null, robots[j]+" is the winner! Let's celebrate with a party.");
						break;
					}
				}
                 
                 }
                 Thread[] threads=new Thread[5];
                 boolean raceOverr=false;
                 for (int i = 0; i < threads.length; i++) {
					threads[i]=new Thread(()-> {
						while(raceOverr == false) {
							robots[i].moveTo(i*100+300, 500);
						}
					});
				}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	  
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}