
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String hi = JOptionPane.showInputDialog("enter a name");
		String tom = "Tom's superpower is flying";
		String bess = "Bess' superpower is invisibility";
		String jason = "Jason's superpower is super strength";
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (hi.equals("tom")) {
			System.out.println(tom);
		} else if (hi.equals("bess")) {
			System.out.println(bess);
		} else if (hi.equals("jason")) {
			System.out.println(jason);
		}

	}
}
