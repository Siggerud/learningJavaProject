package learningJavaProject;

import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;

class Quiz {
	public static void main (String[] arg) {
		Random rand = new Random();
		Scanner myObj = new Scanner(System.in);
		System.out.println("Multiplication quiz, get ready!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int correctAnswers = 0;
		for (int i = 1; i < 11; i++) {
			int int_random1 = rand.nextInt(11);
			int int_random2 = rand.nextInt(11);
			
			int product = int_random1 * int_random2;
			
			System.out.println(i + ". " + int_random1 + " x " + int_random2);
			System.out.println("Answer: ");
			
			int answer = myObj.nextInt();
			
			if (answer == product) {
				correctAnswers++;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("You got " + correctAnswers + "/10 right answers.");
		if (correctAnswers <= 5) {
			System.out.println("Better luck next time.");
		}
		else if (5 < correctAnswers && correctAnswers <= 8) {
			System.out.println("Getting there, try again.");
		}
		else if (correctAnswers > 8) {
			System.out.println("Wow, impressive score!");
		}
		
		
		
		
		
}
}
