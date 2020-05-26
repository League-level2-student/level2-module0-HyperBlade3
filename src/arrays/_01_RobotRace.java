package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(100 * i + 60);
			robots[i].setY(500);
			robots[i].setSpeed(10);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		/*Random random = new Random();
		boolean check = false;
		while (!check) {

			for (int i = 0; i < robots.length; i++) {
				robots[i].move(random.nextInt(50));
				if (robots[i].getY() <= 0) {
					check = true;
					JOptionPane.showInputDialog("This robot " + i + " is the winner!");
				}
			}
		}
		*/

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.
		Random random = new Random();
		for (int i = 0; i < robots.length; i++) {
			robots[i].setX(100 * i + 60);
			robots[i].setY(250);

		}
		int count = 0;
		boolean check = true;
		
		for (int j = 0; j < 35; j++) {

			for (int i = 0; i < robots.length; i++) {
				robots[i].move(random.nextInt(50));
				robots[i].turn(10);
				if (robots[i].getY() > 400) {
					JOptionPane.showInputDialog("This robot " + i + " is the winner!");
					check = false;
				}
				
				
				
				
				
			}
			if (!check) {
				break;
			}
		}

		// 9. make the robots race around a circular track.
	}
}
