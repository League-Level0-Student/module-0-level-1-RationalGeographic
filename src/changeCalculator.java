

		// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class changeCalculator {

	public static void main(String[] args) {

	String nickles = JOptionPane.showInputDialog("How many nickels do you have?");	// Ask the user how many nickels they have

		int q = Integer.parseInt(nickles);// Convert their answer to an int using Integer.parseInt()
		double a = q*0.05;

		String dimes = JOptionPane.showInputDialog("How many dimes do you have");// Ask the user how many dimes they have, and convert their answer

		int w = Integer.parseInt(dimes);
		double s = w*0.10;
		
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");// Ask the user how many quarters they have, and convert their answer

	int e = Integer.parseInt(quarters);
	double d = e*0.25;
		double total = a + s + d;
		System.out.println( "You have " + total + " dollars");// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
 System.out.println("Poof! You're a sandwich");

	}
}

