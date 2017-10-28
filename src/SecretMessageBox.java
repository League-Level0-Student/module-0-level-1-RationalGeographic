//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Macaroni computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		
String friend = "friend";	
	// 1. Set the passcode in a String variable
	String user = JOptionPane.showInputDialog("Who is using this");
	// 2. Using a pop-up, ask for a secret message and store it in a variable
String secret = JOptionPane.showInputDialog("Enter a secret message here");
	// 3. Ask your friend for the passcode and store it in a variable
String input = JOptionPane.showInputDialog("Enter the passcode");
	// 4. If the passcode matches, show the secret message
String passcode = ("ß∆");
if (input.equals(passcode)) {
	if (user.equals(friend)) {
	JOptionPane.showMessageDialog(null, secret);	
	}
	
	
} else {
	JOptionPane.showMessageDialog(null, "INTRUDER ALERT!!!");

}
	// 5. If the passcode does not match, pop-up "INTRUDER ALERT!!!"

	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.
}
}
